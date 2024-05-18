package calculator
import io.cucumber.scala.{EN, ScalaDsl}
import chicken.ChickenCalculator

class StepDefinitions2 extends ScalaDsl with EN {
  var numbers: List[Int] = List.empty
  var result: Int = 0

  Given("""{int} numbers {int} and {int}""") {
    (size: Int, int0: Int, int1: Int) =>
      numbers = List(int0, int1)
  }

  When("""adding those {int} numbers""") { (n: Int) =>
    result = numbers.sum
  }

  Then("""the result is {int}""") { (expectedCount: Int) =>
    assert(numbers.nonEmpty, "No insects were found")
    assert(
      result == expectedCount,
      "Incorrect found insect count"
    )
  }

}
