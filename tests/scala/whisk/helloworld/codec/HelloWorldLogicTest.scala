package whisk.helloworld.codec

import org.scalatest.FunSuite
import org.scalatest.Matchers._
import whisk.helloworld.codec.HelloWorldCodec._

//./pants test tests/scala/whisk/helloworld/codec --test-junit-test=whisk.helloworld.codec.HelloWorldLogicTest
// or you can run it in your IDE, e.g. press Ctrl+Shift+F10 on Linux with default shortcuts
class HelloWorldLogicTest extends FunSuite {
  test("Test Codec") {
    encodeHelloWorld("Hello", "World") shouldBe "Hello World!"
    encodeHelloWorld("Welcome", "Pants") shouldBe "Welcome Pants!"
  }
}
