package whisk.helloworld.fetch

import cats.effect._

object HelloFetcher {
  def fetchHello: IO[String] = IO.pure("Hello")
}
