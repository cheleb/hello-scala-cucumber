import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith
import junit.framework.TestCase
import munit.FunSuite

@RunWith(classOf[Cucumber])
@CucumberOptions(
  plugin = Array(
    "pretty",
    "html:target/cucumber/index.html",
    "json:target/cucumber/cucumber.json"
  ),
  features = Array("classpath:features", "classpath:calculator"),
  glue = Array("classpath:calculator", "classpath:"),
  tags = "not @Wip"
  // glue = Array("classpath:steps")
)
class MUnitRunner
//  extends munit.FunSuite {
//   test("example test that succeeds") {
//     val obtained = 42
//     val expected = 42
//     assertEquals(obtained, expected)
//   }
// }
