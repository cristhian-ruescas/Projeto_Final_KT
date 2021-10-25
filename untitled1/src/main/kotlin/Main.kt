fun main(args: Array<String>) {

    var diametro : Int
    var perimetro : Double
    var pi = 3.14
    var A: Double? = null


    print("Digite o diametro: ")
    diametro = readLine()!!.toDouble().toInt()


    A = 3.14159 * diametro * diametro / 4
    println("A area do diametro é: " + A)

    var r = diametro/2
    perimetro = 2 * pi * r

    println("O perimetro do diametro é: " + perimetro)





}