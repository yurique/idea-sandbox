package example

import something.Something

class Hello[F[_]](something: Something[F]) {

  something.method1()

}
