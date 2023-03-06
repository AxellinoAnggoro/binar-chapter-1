package OOP_SOLID

//1
class Personn(
    var name: String,
    var age: Int,
) {
    fun introduce() {
        return println("Hi, my name is ${name} and i am ${age} years old")
    }
}

//2
class Rectangle(
    var width: Int,
    var height: Int,
) {
    fun getArea(width: Int, height: Int): Int {
        return width * height
    }
}

//3
class Animal(
    var name: String,
    var sound: String,
) {
    fun makeSound() {
        return println("$name says $sound")
    }
}

//4
class Car(
    var brand: String,
    var model: String,
    var year: Int,
) {
    fun startEngine() {
        return println("The $brand $model $year) engine has started!")
    }
}

//5
class BankAccount(var balance: Int) {
    fun deposit(amount: Int): Int {
        balance += amount
        return balance
    }

    fun withdraw(amount: Int): Int {
        balance -= amount
        return balance
    }
}

//6
open class Person(
    var name: String,
    var age: Int,
)

class Student(
    name: String,
    age: Int,
    var kelas: String,
    var nilai: Int,
) : Person(name, age) {
    fun getDetails(): String {
        return "$name $age $kelas $nilai"
    }
}

//7
open class Animalll(val name: String, val gender: String)

class Cat(
    name: String,
    gender: String,
) : Animalll(name, gender) {
    fun makeSound(): String {
        return "Meow"
    }
}

class Dog(
    name: String,
    gender: String,
) : Animalll(name, gender) {
    fun makeSound(): String {
        return "Woof"
    }
}

//8
open class Vehicle(
    var brand: String,
    var color: String,
){
    open fun drive(): String {
        return "Driving $brand"
    }
}

class Carr(
    brand: String,
    color: String,
) : Vehicle(brand, color)
class Motorcycle(
    brand: String,
    color: String,
) : Vehicle(brand, color)

open class Shape(
    var length : Int,
    var width : Int
){
    open fun getArea() : Int{
        return length * width
    }
}

//9
class Rectanglee(
    length: Int,
    width: Int
) : Shape(length, width)

class Square(length: Int) : Shape(length, length)

//10
class User(private var username : String = "asdf", private var password : String = "asdf"){
    fun login(input1 : String, input2 : String) : Boolean{
        if (input1 == username && input2 == password){
            return true
        }
        return false
    }
}

//11
class Personnn(private var name: String, private var age: Int, private var address : String){
    fun getDetails() : String{
        return "$name $age $address"
    }
}



fun main() {
    val bankAccount = BankAccount(100)
    val depo = bankAccount.deposit(100)
    println(depo)
    val wd = bankAccount.withdraw(150)
    println(wd)

    val student = Student("axel", 21, "And-1", 99)
    println(student.getDetails())

    val dog = Dog("cilok", "L")
    println(dog.name)
    println(dog.gender)
    println(dog.makeSound())

    val vehicle = Vehicle("tes", "white")
    val car = Carr("honda", "black")
    println(car.drive())

    val square = Square(4)
    println(square.getArea())

    val user = User()
    println(user.login("asdf", "asdf"))

    val personnn = Personnn("asdf", 20, "asdf")
    println(personnn.getDetails())
}

//5
//open class Vehicle (
//    var brand : String,
//    var color : String
//        )
//{
//    fun drive(){
//        return println("Driving ${brand}")
//    }
//}
//
//class Car : Vehicle
//
//class Motorcycle : Vehicle