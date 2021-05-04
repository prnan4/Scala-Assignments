import org.scalatest.FunSuite

class FactorialTest extends FunSuite{

  test("When the upper limit of range results in a BigInt"){
    assert(Factorial.findFactorialTable(17, 20))
  }

  test("When the lower limit is zero"){
    assert(Factorial.findFactorialTable(0,2))
  }

  test("When the lower limit is a negative integer"){
    assert(!Factorial.findFactorialTable(-3,4))
  }

  test("When lower limit equals upper limit"){
    assert(Factorial.findFactorialTable(2,2))
  }

  test("When one entity is of type Double"){
    assert(!Factorial.findFactorialTable(1.4,9))
  }

  test("When both entities is of type Double"){
    assert(!Factorial.findFactorialTable(1.3,6.4))
  }

  test("When lower limit is larger than upper limit"){
    assert(!Factorial.findFactorialTable(5, 2))
  }

  test("When one input is empty"){
    assert(!Factorial.findFactorialTable(4, ()))
  }

  test("When both inputs are empty"){
    assert(!Factorial.findFactorialTable((),()))
  }

  test("When upper limit of input exceeds 20"){
    assert(!Factorial.findFactorialTable(13,21))
  }
}
