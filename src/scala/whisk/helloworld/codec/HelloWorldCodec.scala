package whisk.helloworld.codec

object HelloWorldCodec {
  def encodeHelloWorld(hello: String, world: String): String = s"$hello $world!"
}
