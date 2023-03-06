package topic5

// SRP
class Dashboard(){
    fun verifyPassword(){}
    fun verifyUsername(){}
    fun verifyToken(){}

    fun getDailyData(){}
    fun getMonthlyData(){}
    fun getWeeklyData(){}

    fun createData(){}
    fun updateData(){}
    fun deleteData(){}
}

class Authenticate(){
    fun verifyPassword(){}
    fun verifyUsername(){}
    fun verifyToken(){}
}

class ManipulateData(){
    fun createData(){}
    fun updateData(){}
    fun deleteData(){}
}

open class ShowData(){
    fun getDailyData(){}
    fun getMonthlyData(){}
    fun getWeeklyData(){}
}

//Open/Close Principle
class DataRecap : ShowData(){
    fun getDataRecap(){}
}

// LSP
abstract class Animall(){
    abstract fun isMammal() : Boolean?

}