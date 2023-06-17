fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Número X: $numeroX")
    println("Número Y: $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    val contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")

    println("Endereço de memória class joao: $contaJoao")
    println("Endereço de memória class maria: $contaMaria")
}