import org.scalatest.FunSuite

class HelloWorldTest extends FunSuite {

  test("Testing for a valid String"){
    assert(HelloWorld.acceptName(Array("Tom")) == true)
  }

  test("Testing when input is empty"){
    assert(HelloWorld.acceptName(Array()) == false)
  }

  test("Testing for a String with more than one word"){
    assert(HelloWorld.acceptName(Array("Mark", "Smith")) == true)
  }

  test("Testing when Empty string is passed"){
    assert(HelloWorld.acceptName(Array("")) == false)
  }

  test("When value of type integer is given as input"){
    assert(HelloWorld.acceptName(Array(4)) == false)
  }

  test("When value of type double is given as input"){
    assert(HelloWorld.acceptName(Array(2.4)) == false)
  }

  test("When input is a single character"){
    assert(HelloWorld.acceptName(Array('m')) == false)
  }

  test("Testing for array of mixed type"){
    assert(HelloWorld.acceptName(Array(1, 2.5, 'l')) == false)
  }

  test("Testing for a character that is a symbol"){
    assert(HelloWorld.acceptName(Array('+')) == false)
  }

  test("Testing for a string of symbols"){
    assert(HelloWorld.acceptName(Array("*^%$")) == true)
  }
}
