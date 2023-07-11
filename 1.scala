object Prime{

    def isPrime(n: Int): Boolean = {
        def isPrimeHelper(divisor: Int): Boolean = {
            if (divisor <= 1)
                true
            else if (n % divisor == 0)
                false
            else
                isPrimeHelper(divisor - 1)
        }

    isPrimeHelper(n / 2)
    }

    def main(args:Array[String]): Unit = {
        println(isPrime(5));
    }

}

