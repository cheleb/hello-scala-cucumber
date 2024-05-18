import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith
import junit.framework.TestCase
import munit.FunSuite

@RunWith(classOf[Cucumber])
@CucumberOptions(
  plugin = Array("pretty"),
  features = Array("src/test/resources/features")
  // glue = Array("steps")
)
class TestRunner extends TestCase {
//   test("example test that succeeds") {
//     val obtained = 42
//     val expected = 42
//     assertEquals(obtained, expected)
//   }

}
