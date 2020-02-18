package whisk.helloworld.app

import cats.effect.IO
import whisk.helloworld.codec.HelloWorldCodec._
import whisk.helloworld.fetch.HelloFetcher._
import whisk.helloworld.fetch.WorldFetcher._

object HelloWorldLogic {
  def buildHelloWorld(): IO[String] = {
    for {
      hello <- fetchHello
      world <- fetchWorld
    } yield encodeHelloWorld(hello, world)
  }
}
