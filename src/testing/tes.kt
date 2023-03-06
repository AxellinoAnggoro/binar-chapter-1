package testing

//class Cashier(private val productName: String, private val quantity: Int, private val itemPrice: Double, private val payment: Double) {
//
//    fun getTotalPrice(): Double {
//        return itemPrice * quantity
//    }
//
//    fun getExchange(): Double {
//        return payment - getTotalPrice()
//    }
//
//    override fun toString(): String {
//        return "Customer Name: $productName\nProduct Name: $productName\nQuantity: $quantity\nItem Price: $itemPrice\nPayment: $payment\nTotal Price: ${getTotalPrice()}\nExchange: ${getExchange()}"
//    }
//}
//
//fun getUserInput(): Cashier {
//    print("Enter customer name: ")
//    val customerName = readLine()
//
//    print("Enter product name: ")
//    val productName = readLine()
//
//    print("Enter quantity: ")
//    val quantity = readLine()?.toInt() ?: 0
//
//    print("Enter item price: ")
//    val itemPrice = readLine()?.toDouble() ?: 0.0
//
//    print("Enter payment: ")
//    val payment = readLine()?.toDouble() ?: 0.0
//
//    return Cashier(customerName ?: "", productName ?: "", quantity, itemPrice, payment)
//}
//
//fun main() {
//    val cashier = getUserInput()
//
//    println(cashier)
//}

fun main() {
    val studentInfo = getStudentInfo()
    println(studentInfo)
}

fun getStudentInfo(): Student {
    val student = Student()
    return student.apply {
        print("Please enter the student's first name: ")
        FName = readLine()
        print("Please enter the student's last name: ")
        LName = readLine()
        print("Please enter the student's street add: ")
        Street_Add = readLine()
        print("Please enter the student's city: ")
        City = readLine()
        print("Please enter the student's state: ")
        State = readLine()
        print("Please enter the student's zip: ")
        Zip = readLine()?.toInt()
        print("Please enter the student's gpa: ")
        GPA = readLine()?.toDouble()
        print("Please enter the student's major: ")
        Major = readLine()
    }
}

data class Student(
    var FName: String? = null,
    var LName: String? = null,
    var Street_Add: String? = null,
    var City: String? = null,
    var State: String? = null,
    var Zip: Int? = null,
    var GPA: Double? = null,
    var Major: String? = null
)