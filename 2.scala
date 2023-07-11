object prime{

def primeSeq(n: Int): Unit = {
  def isPrime(number: Int, divisor: Int): Boolean = {
    if (divisor <= 1)
      true
    else if (number % divisor == 0)
      false
    else
      isPrime(number, divisor - 1)
  }

  def printPrimes(number: Int): Unit = {
    if (number > 1) {
      if (isPrime(number, number - 1))
        println(number)
      printPrimes(number - 1)
    }
  }

  printPrimes(n - 1)
}


    def main(args:Array[String]): Unit = {
        primeSeq(10);

        
    }
}