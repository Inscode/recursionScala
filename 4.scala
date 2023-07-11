object checkEven{

    def isEven(n: Int): Boolean = {
    if (n == 0)
        true
    else if (n == 1)
        false
    else if (n < 0)
        isEven(-n)
    else
        isEven(n - 2)
    }




    def main(args:Array[String]): Unit = {

        println(isEven(10));

    }

            
}