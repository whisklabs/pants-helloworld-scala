## Pants HelloWorld Scala project

Use this as an example for your new Pants project.
Pants supports a lot more and here we focus on how to quickly create basic Scala project,
without using all Pants features together.

This project is very simple and the only is a usage of multiple modules.
It's by no means an effective or elegant solution to print "Hello World!" :)

We don't use `strict_deps` here, as it's easier to
migrate your project without it and later convert using
[pants-dependency-sanitizer](https://github.com/whisklabs/pants-dependency-sanitizer).

### Files you should re-use in your project:

- BUILD files for every module (it's common to have one module per folder).
- pants.ini
- BUILD.tools

### Supported commands:

- Compile your code

      ./pants compile src/scala/:: tests/scala/::

- Run tests

      ./pants test tests/scala/::

- Lint everything

      ./pants fmt src/:: tests/::
      
- To stop Pants and clean cache:

      ./pants clean-all

### Known Pants problems (on Feb 18 2020):

- Not every python version and installation works.
  It's safe to use Python 3.6 (but 3.7 works too) and set env variable:

      PYTHON=/usr/bin/python3.6

- Not every Pants version will work everywhere.
  Usually every stable version works in Linux, but MacOS support might appear a bit later.
  Current version we use right now: 1.21.0

- For other known problems and workarounds check
  [Pants installation docs](https://www.pantsbuild.org/install.html) or
  [Pants Github issues](https://github.com/pantsbuild/pants/issues)


### Pants docs

- [Pants docs](pantsbuild.org)
- [Pants repository](https://github.com/pantsbuild/pants) (has `examples` folder)
