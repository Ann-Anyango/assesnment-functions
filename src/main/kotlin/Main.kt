fun main() {

    val inputString = "Hello, world!"
    val result = processString(inputString)
    println("First character: ${result.first}")
    println("Last character: ${result.second}")
    println("Length of the string: ${result.third}")
    println("Begins with a vowel: ${result.third}")
    var container=(current("303435stres","Ann Anyango",345))
    println(container)
    println(password(45))
//    println(SavingsAccount("0675893","jo)
}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun processString(inputString: String): Triple<Char, Char, Int> {
    val firstChar = inputString.first()
    val lastChar = inputString.last()
    val length = inputString.length
    val startsWithVowel = when(firstChar.toLowerCase()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
    return Triple(firstChar, lastChar, length, )
}
///Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)
 fun password(number: Int):Boolean{
    var characters= mutableListOf(number)
    return password(45)
 }











//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
 class current( var accountNumber:String, var accountName:String, var balanvce:Int)

       fun deposit(num:Double){
           var Account=deposit(34.4)





 }
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
class SavingsAccount(accountNumber: String, accountName: String, initialBalance: Double) :
        Account(accountNumber, accountName, initialBalance) {

    var withdrawals: Int = 0

    fun withdraw(amount: Double): Boolean {
        if (withdrawals < 4 && super.withdraw(amount)) {
            withdrawals++
            return true
        }
        return false
    }
}

