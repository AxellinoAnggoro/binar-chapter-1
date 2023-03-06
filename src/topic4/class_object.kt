package topic4

class Transaksi(val nama: String, val judul: String, val jumlah: Int, val harga: Double, val jmlPembayaran: Double) {
    }

fun getTransaksi(): Transaksi {
    println("==========================================")
    println("INPUT TRANSAKSI PENJUALAN TOKO BUKU AND1")
    println("==========================================")
    print("Nama Pembeli: ")
    val nama = readLine()!!.toUpperCase()
    print("Judul Buku: ")
    val judul = readLine()!!
    print("Jumlah: ")
    val jumlah = readLine()!!.toInt()
    print("Harga: ")
    val harga = readLine()!!.toDouble()
    print("Uang Bayar: ")
    val jmlPembayaran = readLine()!!.toDouble()
    return Transaksi(nama, judul, jumlah, harga, jmlPembayaran)
}

fun totalHarga(transaksi: Transaksi) :Double{
    return  transaksi.jumlah * transaksi.harga
}

fun totalKembalian(transaksi: Transaksi) : Double{
    val totalHarga = transaksi.jumlah * transaksi.harga
    return transaksi.jmlPembayaran - totalHarga
}

fun cekBonus(transaksi: Transaksi) {
    val totalHarga = transaksi.jumlah * transaksi.harga
    val bonus : Double
    when{
        totalHarga > 300000 -> {
            bonus = totalHarga - 50000
            return println("Bonus: Dapat diskon pembelian buku sebesar Rp50.000 sehingga harga beli buku $bonus")
        }

        totalHarga > 200000 -> {
            return println("Bonus: 1 buah buku")
        }

        totalHarga > 150000 -> {
            return println("Bonus: 1 buah pena")
        }

        else ->{
           return println("Bonus: 0")
        }
    }
}



fun main(){
    val transaksi = getTransaksi()

    println()
    println("==========================================")
    println("STRUK PEMBELIAN BUKU TOKO AND1")
    println("==========================================")
    println("Nama Pembeli: ${transaksi.nama}")
    println("Buku yg dibeli: ${transaksi.judul}")
    println("Jumlah: ${transaksi.jumlah}")
    val totalHarga = totalHarga(transaksi)
    println("Total: $totalHarga")
    println("Bayar: ${transaksi.jmlPembayaran}")
    val kembalian = totalKembalian(transaksi)
    println("Kembali: $kembalian")
    cekBonus(transaksi)
}