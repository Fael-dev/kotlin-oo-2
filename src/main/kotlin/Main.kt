fun main() {
    println("Bem-vindo ao Bytebank")
    // Pode se declarar assim também sem seguir a ordem dos parametros, utilizando labels:
    // val conta1 = Conta(titular = "Rafael", numero = 1000)
    // val conta1 = Conta(numero = 1000, titular = "Rafael")
    val conta1 = Conta("Rafael", 1000)
    println("Conta 1, titular: ${conta1.titular}")
    println("Conta 1, número: ${conta1.numero}")
    println("Conta 1, saldo: ${conta1.saldo}")
    conta1.depositar(20.0)
    conta1.sacar(18.0)
    println("")

    val conta2 = Conta("Rafael", 1001)
    if (conta1.transferir(1.0, conta2)) {
        println("Transferência realizada da conta ${conta1.titular} para a conta ${conta2.titular}, no valor de R$ 1,00")
    } else {
        println("Não foi possível realizar a transferência da conta ${conta1.titular} para a conta ${conta2.titular}")
    }
}

// Construtor primário: class Conta {}
// Definir parametros no construtor primário: class Conta(titular: String, numero: Int, saldo: Double) {}
// Definir as propriedades no construtor primário: class Conta(var titular: String, var numero: Int, var saldo: Double) {}
// init {
//      //Executa alguma coisa durante inicialização do construtor da classe.
//    }
class Conta (var titular: String = "", var numero: Int = 0) {
    var saldo = 0.0
        private set
    fun depositar(deposito: Double) {
        if (deposito > 0.0) {
            this.saldo += deposito
            println("Depositando R$ ${deposito} na conta do ${this.titular}...\nSaldo anterior: R$ ${this.saldo - deposito}\n" +
                    "Saldo atual: R\$ ${this.saldo}")
        }
    }

    fun sacar(saque: Double) {
        if(this.saldo >= saque) {
            this.saldo -= saque
            println("Saque realizado no valor de R$ ${saque}, saldo atual de R$ ${this.saldo}")
        } else {
            println("Saldo na conta insuficiente: R$ ${this.saldo}")
        }
    }

    fun transferir(transferencia: Double, destino: Conta): Boolean {
        if (this.saldo >= transferencia) {
            this.saldo -= transferencia
            destino.depositar(transferencia)
            return true
        }
        return false
    }
}

fun testeCopiasEReferencias() {
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

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Rafael $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular ($i): $titular")
        println("Número da Conta ($i): $numeroConta")
        println("Saldo da Conta ($i): $saldo")
        testaCondicoes(saldo)
        println("")
        i++
    }

    for (i in  5 downTo 1) {
        val titular: String = "Rafael $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular ($i): $titular")
        println("Número da Conta ($i): $numeroConta")
        println("Saldo da Conta ($i): $saldo")
        testaCondicoes(saldo)
        println("")
    }
}
fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) println("Conta é positiva")
    else if (saldo == 0.0) println("Conta é neutra")
    else println("Conta é negativa")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}