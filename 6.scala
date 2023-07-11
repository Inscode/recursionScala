object fibonacci{

def printFibonacci(n: Int): Unit = {
  def fibonacci(num: Int): Int = {
    if (num <= 1)
      num
    else
      fibonacci(num - 1) + fibonacci(num - 2)
  }

  for (i <- 0 until n) {
    println(fibonacci(i))
  }
}





    def main(args:Array[String]): Unit = {

        printFibonacci(4);

    }

            
}