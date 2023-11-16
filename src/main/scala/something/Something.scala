package something

trait Something[F[_]] {

  def method1(): Unit

}

object Something {

  def apply[F[_]](): Something[F] = new Something[F] {

    def method1(): Unit = println("hi")

  }

}
