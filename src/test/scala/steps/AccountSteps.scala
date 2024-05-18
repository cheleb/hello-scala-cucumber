//package steps
import io.cucumber.scala.{EN, ScalaDsl}
import chicken.ChickenCalculator
import bank.Account
import scala.jdk.CollectionConverters._

class AccountSteps extends ScalaDsl with EN {

  var accounts: List[Account] = List()

  DataTableType { (entry: Map[String, String]) =>
    Account(entry("account"), entry("balance").toDouble)
  }

  Given("""Tess has the following accounts:""") {
    (dataTable: io.cucumber.datatable.DataTable) =>
      accounts = dataTable.asList[Account](classOf[Account]).asScala.toList
  }
  When("""she transfers {double} from current to savings""") {
    (double1: Double) =>
      accounts = accounts.map {
        case Account("current", balance) =>
          Account("current", balance - double1)
        case Account("savings", balance) =>
          Account("savings", balance + double1)
      }

  }
  Then("""her accounts should look like this:""") {
    (dataTable: io.cucumber.datatable.DataTable) =>
      val expected = dataTable.asList[Account](classOf[Account]).asScala.toList
      assert(accounts == expected)

  }
}
