fun main() {

    val name = "Hello World"

    println(name)

//Basic Arithmetic operators

    fun basicArithmeticOperations(num1: Int, num2: Int): List<Any> {
        val sum = num1 + num2
        val difference = num1 - num2
        val product = num1 * num2
        val quotient = num1.toDouble() / num2.toDouble()

        return listOf(sum, difference, product, quotient)
    }

    val results = basicArithmeticOperations(10, 5)
    println("Sum: ${results[0]}")
    println("Difference: ${results[1]}")
    println("Product: ${results[2]}")
    println("Quotient: ${results[3]}")

    // Check Even or Odd

    fun checkNo(n : Int) {

        if(n % 2 == 0) println("n is even") else println("n is odd")
    }

    checkNo(8)

    //  Find the Largest No

    fun findLargest(a : Int , b : Int, c : Int ): Int {

        if (a >= b && a >= c) {

            return a

        } else if (b >= a && b >= c) {

            return b

        } else {

            return c
        }
    }

    println(findLargest(a = 8, b= 2, c = 6))

    // Calculate factorial

    fun factorial(n : Int) : Long {

        var result = 1L
        for(i in 1..n) {
            result *= i
        }
        return result
    }

    val number = 5
    val factorial = factorial(number)
    println("Factorial of $number is : $factorial")

    // Reverse a String

    fun reverseString(str : String) : String {

        return str.reversed()
    }

    val orignalString = "Hi Laiba"
    val reverseString = reverseString(orignalString)
    println("orignalString : $orignalString")
    println("reverseString : $reverseString")

    // Check prime no

    fun isPrime(number:Int): Boolean {

        if (number <= 1) {

            return false
        }

        for (i in 2 until number) {

            if (number % i == 0)

                return false
        }

        return true
    }

    println(isPrime(5))

    // palindrome checker

    fun isPalindrome(s : String) : Boolean {

        val filterstring = s.filter { it. isLetterOrDigit() } . lowercase()

        println(s.length)
        return filterstring == filterstring.reversed()

    }

    println(isPalindrome(  "12121"))

    // count vowels

    fun countVowels(s : String) : Int {

        var count = 0
        val vowels = listOf('a','e','i','o','u')
        for (char in s) {

            if (char in vowels) {

                count++
            }
        }
        return count
    }

    println(countVowels("aeiou"))

    // Celsius to Fahenheit

    fun celsiusToFahrenheit(c:Double): Double {

        return (c * 9/5) + 32
    }

    println(celsiusToFahrenheit(20.0))

    // largest no of array

    val arr = intArrayOf(7, 9, 8, 1, 4, 12)

    var max = arr[0]

    for (i in 1 until arr.size) {

        if (arr[i] > max) {

            max = arr[i]
        }
    }

    println("The largest no of array is : $max")

    // Sum of array element

    fun sumArrayElements(array : IntArray): Int {

        var sum = 0

        for (element in array) {
            sum += element
        }
        return sum
    }

    val array = intArrayOf(2,4,5,6,7,8,9)
    val sum = sumArrayElements(array)
    println("Sum : $sum")

    // Min value in list

    fun findMinValue(list: List<Int>): Int {

        return list.min()
    }

    val list = listOf(5,7,2,4,8,9)
    val min = findMinValue(list)
    println("Minimum value is : $min")


    // two list and return list of element

    fun commonElements(list1: List<Int>, list2: List<Int>): List<Int> {

        val common = mutableListOf<Int>()

        for (element in list1) {

            if (element in list2 && element !in common) {

                common.add(element)
            }
        }
        return common
    }
    val list1 = listOf(2,5,6,1,4,6)
    val list2 = listOf(5,7,9,2,4,0)
    val result = commonElements(list1 , list2)
    println("commonElements : $result")

    // fabonnaci series

    fun fibonacci(n : Int){
        var a = 0
        var b = 1

        println(" fabonaci series $n")
        while (a <= n) {
            println("$a")
            val sum = a + b
            a = b
            b = sum
        }
    }
    fibonacci(8)

    // Simple Calculator

    println("Enter Num1")
    val InputNumber1 = readln()
    val num1 = InputNumber1.toDouble()

    println("Enter Num2")
    val InputNumber2 = readln()
    val num2 = InputNumber2.toDouble()

    println("Choose an operation:")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")


    println("Enter Choice")
    val choice = readln().toInt()

    var result1: Double = 0.0

    when (choice) {
        1 -> result1 = num1 + num2
        2 -> result1 = num1 - num2
        3 -> result1 = num1 * num2
        4 -> result1 = num1 / num2
        else -> println("Invalid choice")
    }

    println("Result: $result1")
}
