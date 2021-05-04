import org.scalatest.FunSuite

class FactorialTest extends FunSuite{

  test("Testing for maximum Limit: 20"){
    var res = 2432902008176640000L
    assert(Factorial.findFactorial(20) == res)
  }

  test("Testing minimum Limit: 0"){
    assert(Factorial.findFactorial(0) == 1)
  }

  test("Testing beyond maximum Limit"){
    assert(Factorial.findFactorial(21) == -1)
  }

  test("Input is empty"){
    assert(Factorial.findFactorial() == -1)
  }

  test("Testing for negative integer"){
    assert(Factorial.findFactorial(-1) == -1)
  }

  test("Input that is within the limits"){
    assert(Factorial.findFactorial(6) == 720)
  }

  test("Input is a Double value"){
    assert(Factorial.findFactorial(9.5) == -1)
  }

  test("Input is a character"){
    assert(Factorial.findFactorial('a') == -1)
  }

  test("Testing for string"){
    assert(Factorial.findFactorial("hello") == -1)
  }

  test("Testing for input 1"){
    assert(Factorial.findFactorial(1) == 1)
  }
}
