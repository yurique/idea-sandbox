package example

trait Something {

  def method1(): Unit

}

object Something {

  def apply(): Something = new Something {

    def method1(): Unit = println("hi")

  }

}
