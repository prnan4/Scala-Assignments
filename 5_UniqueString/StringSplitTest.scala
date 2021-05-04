import org.scalatest.FunSuite

class StringSplitTest extends FunSuite{

  test("Every word in the string is same"){
    assert(StringSplit.computeUniqueSubstring("Hey Hey Hey Hey"))
  }

  test("Empty string is the input"){
    assert(!StringSplit.computeUniqueSubstring(""))
  }

  test("Every word in the string is unique"){
    assert(StringSplit.computeUniqueSubstring("What is your name?"))
  }

  test("String contains a single word"){
    assert(StringSplit.computeUniqueSubstring("World"))
  }

  test("String contains a single character"){
    assert(!StringSplit.computeUniqueSubstring('a'))
  }

  test("Input is an integer"){
    assert(!StringSplit.computeUniqueSubstring(100))
  }

  test("Input is an Double"){
    assert(!StringSplit.computeUniqueSubstring(7.5))
  }

  test("Input is empty"){
    assert(!StringSplit.computeUniqueSubstring(()))
  }
}
