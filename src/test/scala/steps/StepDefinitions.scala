//package steps
import io.cucumber.scala.{EN, ScalaDsl}
import chicken.ChickenCalculator

class StepDefinitions extends ScalaDsl with EN {
  var chickenCalculator: Option[ChickenCalculator] = None
  var actualInsectCount: Option[Int] = None

  Given("""a chicken collects {int} insects per minute""") {
    (insectsPerMinute: Int) =>
      chickenCalculator = Some(new ChickenCalculator(insectsPerMinute))
  }

  When("""chicken has searched insects for {int} minutes""") { (minutes: Int) =>
    actualInsectCount = chickenCalculator.map(_.searchInsects(minutes))
  }

  Then("""the chicken has found {int} insects""") {
    (expectedInsectCount: Int) =>
      assert(actualInsectCount.nonEmpty, "No insects were found")
      assert(
        actualInsectCount.get == expectedInsectCount,
        "Incorrect found insect count"
      )
  }

  When("""chicken has searched insects for {int} hours""") { (hours: Int) =>
    actualInsectCount = chickenCalculator.map(_.searchInsects(60 * hours))
  }
}
