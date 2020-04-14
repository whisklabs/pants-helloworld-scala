scala_library(
    name="main-lib",
    sources=globs("*.scala"),
    dependencies=[
        '3rdparty:cats-effect',
        'src/scala/whisk/helloworld/codec',
        'src/scala/whisk/helloworld/fetch'
    ]
)

jvm_binary(
    name="main-bin",
    main="whisk.helloworld.app.HelloWorldApp",
    dependencies=[
        ":main-lib"
    ]
)

jvm_app(
    basename="hello-world",
    binary=":main-bin"
)
