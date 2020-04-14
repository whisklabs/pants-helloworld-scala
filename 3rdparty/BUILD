CATS = '2.0.0'

managed_jar_libraries(
    name='management',
    artifacts=[
        scala_jar('org.typelevel', 'cats-core', CATS),
        scala_jar('org.typelevel', 'cats-effect', CATS),
    ]
)

jar_library(
    name='cats',
    jars=[
        scala_jar('org.typelevel', 'cats-core', CATS),
    ])

jar_library(
    name='cats-effect',
    jars=[
        scala_jar('org.typelevel', 'cats-effect', CATS),
    ])

jar_library(
    name='scalatest',
    jars=[
        scala_jar('org.scalatest', 'scalatest', '3.0.5'),
        jar('junit', 'junit', '4.12')
    ])
