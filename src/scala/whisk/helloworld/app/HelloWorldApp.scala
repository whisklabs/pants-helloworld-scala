package whisk.helloworld.app

import whisk.helloworld.app.HelloWorldLogic._

// ./pants run src/scala/whisk/helloworld/app:main-bin
// or
// ./pants bundle src/scala/whisk/helloworld/app:main-bin
// java -jar ./dist/main-bin.jar
object HelloWorldApp {
  def main(args: Array[String]): Unit = {
    buildHelloWorld().map(println).unsafeRunSync()
  }
}
