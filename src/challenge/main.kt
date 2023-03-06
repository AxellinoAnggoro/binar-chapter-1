package challenge

class Challenge1(private val baris: Int) {
    fun createHalfTriangle() {
        for (i in 1.rangeTo(baris)) {
            for (j in 1.rangeTo(i)) {
                print("*")
            }
            println()
        }
    }
}

class Challenge2(private val baris: Int) {
    fun createTriangle() {
        for (i in 1.rangeTo(baris)) {
            for (j in i until baris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            println()
        }
    }
}

class Challenge3(private val baris: Int) {
    fun createUpsideDownTriangle() {
        for (i in baris.downTo(1)) {
            for (j in i until baris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            println()
        }
    }
}

class Challenge4(private val baris: Int) {
    fun createDiamond() {
        for (i in 1.rangeTo(baris)) {
            for (j in i until baris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            println()
        }
        for (i in baris.downTo(1)) {
            for (j in i until baris) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            println()
        }
    }
}

class Challenge5(private val baris: Int){
    fun createPlus(){
        for(i in 1 until (baris * 2)){
            if (i == baris){
                for (j in 1 until (baris * 2)){
                    print("*")
                }
            }
            else{
                for (j in 1 until baris){
                    print(" ")
                }
                print("*")
            }
            println()
        }
    }
}

class Challenge6(private val baris: Int){
    fun createX(){
        for (i in 1 until (baris * 2)){
            for (j in 1 until (baris * 2)){
                if (j==i || j == (baris*2) - i){
                    print("*")
                }
                else{
                    print(" ")
                }
            }
            println()
        }
    }
}

fun main() {
    val challenge1 = Challenge1(8)
    challenge1.createHalfTriangle()

    println()

    val challenge2 = Challenge2(8)
    challenge2.createTriangle()

    println()

    val challenge3 = Challenge3(8)
    challenge3.createUpsideDownTriangle()

    println()

    val challenge4 = Challenge4(8)
    challenge4.createDiamond()

    println()

    val challenge5 = Challenge5(8)
    challenge5.createPlus()

    println()

    val challenge6 = Challenge6(8)
    challenge6.createX()
}