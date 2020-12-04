class FizzBuzz {
  def main(args: Array[String]): Unit = {
    for (i <- Range.inclusive(1, 100)) {
      println(
        if (i % 15 == 0) "FizzBuzz"
        else if (i % 3 == 0) "Fizz"
        else if (i % 5 == 0) "Buzz"
        else i
      )
    }
  }
}
