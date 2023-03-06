package topic3

fun main(){
    val a = isOdd(4)
    println(a)

    val b = getDiscount(100.0,20.0)
    println(b)

    val c = println(calculateGrade(91))

    val hari : Int = 3
    val hariIni = when(hari){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jumat"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> "tidak ada"
    }
    println(hariIni)



    for (i in 1..10){
        print("$i,")
    }

    println()

    for (i in 1..20 step 2){
        print("$i,")
    }

    println()

    for (i in 'A'..'Z'){
        print("$i,")
    }

    println()

    for (i in 10.downTo(1)){
        print("$i ")
    }

    println()

    var temp: Int = 0
    for (i in 1..100 step 2) {
        temp += i
    }
    println(temp)

    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
        print("\n")
    }

    for(i in 1.rangeTo(4)) {
        for(j in i until (4)) {
            print(" ")
        }
        for(k in 1 until 2*i){
            print("*")
        }
        print("\n")
    }

    var i =1
    while (i <= 20){
        if(i%2 == 0){
            println(i)
        }
        i++
    }

    println()

    var sum = 0
    var j = 1
    while (j <= 50) {
        if (j % 2 == 1) {
            sum += j
        }
        j++
    }
    println(sum)

    var k = 1
    do {
        if (k%2 == 1) {
            println(k)
        }
        k++
    } while (k<20)

    print("Masukkan sebuah bilangan bulat positif: ")
    val bilBulat = readLine()!!.toInt()
    var p = 1
    do {
        println(p)
        p++
    }while (p < bilBulat)


}


fun isOdd(a : Int) : Boolean{
    if (a%2 == 1){
        return true
    }
    else{
        return false
    }
}

fun getDiscount(price : Double, discount : Double) : Double{

    if(price>100 && discount>10){
        val hargaDiskon : Double = price * discount/100
        val setelahDiskon : Double = price - hargaDiskon
        return setelahDiskon
    }
    else{
        return price
    }
}

fun calculateGrade(nilai : Int): Char{
    if(nilai in 90..100){
        return 'A'
    }
    else if (nilai in 80..89){
        return 'B'
    }
    else if (nilai in 70..79){
        return 'C'
    }
    else if (nilai in 60..69){
        return 'D'
    }
    return 'E'
}
