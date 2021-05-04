import org.scalatest.FunSuite

class FactorialTest extends FunSuite{

  test("When the upper limit of range results in a BigInt"){
    assert(Factorial.findFactorialTable(15, 20))
  }

  test("When the lower limit is zero"){
    assert(Factorial.findFactorialTable(0,3))
  }

  test("When the lower limit is a negative integer"){
    assert(!Factorial.findFactorialTable(-2,3))
  }

  test("When lower limit equals upper limit"){
    assert(Factorial.findFactorialTable(1,1))
  }

  test("When one entity is of type Double"){
    assert(!Factorial.findFactorialTable(1.5,9))
  }

  test("When both entities is of type Double"){
    assert(!Factorial.findFactorialTable(1.2,9.4))
  }

  test("When lower limit is larger than upper limit"){
    assert(!Factorial.findFactorialTable(8, 2))
  }

  test("When one input is empty"){
    assert(!Factorial.findFactorialTable(3, ()))
  }

  test("When both inputs are empty"){
    assert(!Factorial.findFactorialTable((),()))
  }

  test("When upper limit of input exceeds 20"){
    assert(!Factorial.findFactorialTable(17,21))
  }
}
