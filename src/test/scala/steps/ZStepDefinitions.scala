//package steps
import io.cucumber.scala.{EN, ScalaDsl}
import chicken.ChickenCalculator
import chicken.ZChickenCalulator

import scala.compiletime.uninitialized

import dev.cheleb.zioserenity.*

import zio.*

class ZStepDefinitions extends ScalaDsl with EN {
  var numbers: UIO[List[Int]] = uninitialized
  var result: Int = 0

  Given("""{int} random numbers""") { (size: Int) =>
    numbers = ZChickenCalulator.random(size)
  }

  When("""adding those numbers""") {
    // val runtime = Runtime.default
    // val rr = Unsafe.unsafe { implicit unsafe =>
    //   runtime.unsafe.run(numbers).getOrThrowFiberFailure()
    // }
    result = numbers.run.sum

  }

  Then("""the result is > {int}""") { (min: Int) =>
//    assert(numbers.nonEmpty, "No insects were found")
    assert(
      result > min,
      "Incorrect found insect count"
    )
  }

}
