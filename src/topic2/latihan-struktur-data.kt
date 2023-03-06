package topic2

fun main() {
//Deklarasi variabel “nama “  bertipe data String dan memasukkan nilai  "John Doe"
    val nama: String = "John Doe"

//Deklarasi variabel umur bertipe data Int dan memasukkan nilai 25
    val umur: Int = 25

//Deklarasi variabel gaji bertipe data Double dan memasukkan nilai 5000.0
    val gaji: Double = 5000.0

//Deklarasi variabel status bertipe data Boolean dan memasukkan nilai true
    val status: Boolean = true

//Deklarasi variabel nilai bertipe data Float dan memasukkan nilai 7.5f
    val nilai: Float = 7.5f

//Deklarasi variabel angka1 bertipe data Long dan memasukkan nilai 123456789L
    val angka1: Long = 123456789L

//Deklarasi variabel angka2 bertipe data Short dan memasukkan nilai 100
    val angka2: Short = 100

//Deklarasi variabel huruf bertipe data Char dan memasukkan nilai 'A'
    val huruf: Char = 'A'

//Deklarasi variabel nilaiString bertipe data String dan memasukkan nilai "10"
    val nilaiString: String = "10"

//Deklarasi variabel angka3 bertipe data Byte dan memasukkan nilai 25
    val angka3: Byte = 25

//Deklarasi array angka bertipe data IntArray dan memasukkan nilai [1, 2, 3, 4, 5]
    val arrAngka = intArrayOf(1, 2, 3, 4, 5)

//Deklarasi array huruf bertipe data CharArray dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val arrHuruf = charArrayOf('a', 'b', 'c', 'd', 'e')

//Deklarasi array nilai bertipe data DoubleArray dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    val arrNilai = doubleArrayOf(3.5, 4.0, 2.5, 3.0)

//Deklarasi array nama bertipe data Array<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val arrNama = arrayOf("John", "Doe", "Jane", "Doe")

//Deklarasi array bulan bertipe data Array<String> dengan ukuran 12 dan memasukkan nilai ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val bulan = Array(12){""}
    bulan[0] = "Januari"
    bulan[1] = "Februari"
    bulan[2] = "Maret"
    bulan[3] = "April"
    bulan[4] = "Mei"
    bulan[5] = "Juni"
    bulan[6] = "Juli"
    bulan[7] = "Agustus"
    bulan[8] = "September"
    bulan[9] = "Oktober"
    bulan[10] = "November"
    bulan[11] = "Desember"

//Deklarasi array nilaiFloat bertipe data FloatArray dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val arrNilaiFloat = floatArrayOf(2.5f, 3.0f, 2.0f)

//Deklarasi list angka dengan tipe data List<Int> dan memasukkan nilai [1, 2, 3, 4, 5]
    val listAngka = listOf<Int>(1, 2, 3, 4, 5)

//Deklarasi list huruf dengan tipe data List<Char> dan memasukkan nilai ['a', 'b', 'c', 'd', 'e']
    val listHuruf = listOf<Char>('a', 'b', 'c', 'd', 'e')

//Deklarasi list nilai dengan tipe data List<Double> dan memasukkan nilai [3.5, 4.0, 2.5, 3.0]
    val listNilai = listOf<Double>(3.5, 4.0, 2.5, 3.0)

//Deklarasi list nama dengan tipe data List<String> dan memasukkan nilai ["John", "Doe", "Jane", "Doe"]
    val listNama = listOf<String>("John", "Doe", "Jane", "Doe")

//Deklarasi list bulan dengan tipe data List<String> dan memasukkan nilai ["Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"]
    val listBulan = listOf<String>("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")

//Deklarasi list nilaiFloat dengan tipe data List<Float> dan memasukkan nilai [2.5f, 3.0f, 2.0f]
    val listNilaiFloat = listOf<Float>(2.5f, 3.0f, 2.0f)

//Mengubah nilai pada indeks tertentu dalam list angka menjadi nilai 10 , list data : (1, 2, 3, 4, 5)
    val listAngka2 = mutableListOf(1, 2, 3, 4, 5)
    listAngka2[1] = 10

//Mengubah nilai pada indeks tertentu dalam list huruf menjadi nilai 'f', list data : ('a', 'b', 'c', 'd', 'e')
    val listHuruf2 = mutableListOf('a', 'b', 'c', 'd', 'e')
    listHuruf2[3] = 'f'

//Menambahkan nilai baru ke dalam list nilai, list data : nilai = (3.5, 4.0, 2.5, 3.0)
    val listNilai2 = mutableListOf(3.5, 4.0, 2.5, 3.0)
    listNilai2.add(8.5)

//Menghapus nilai pada indeks tertentu dalam list nama, list data : nama =  ("John", "Doe", "Jane", "Doe")
    val listNama2 = mutableListOf("John", "Doe", "Jane", "Doe")
    listNama2.remove("Jane")

//Menyalin nilai dari list bulan ke list bulanBaru dan menambahkan nilai 'Januari' ke list bulanBaru, list data : bulan = ("Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    val listBulanBaru = mutableListOf<String>()
    listBulanBaru.addAll(listBulan)

    val tes = arrayOf('A', 'B')
    tes[1] = '8'

}




