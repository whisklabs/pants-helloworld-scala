package whisk.helloworld.fetch

import cats.effect.IO

object WorldFetcher {
  def fetchWorld: IO[String] = IO.pure("World")
}
