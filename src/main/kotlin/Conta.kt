// Construtor primário: class Conta {}
// Definir parametros no construtor primário: class Conta(titular: String, numero: Int, saldo: Double) {}
// Definir as propriedades no construtor primário: class Conta(var titular: String, var numero: Int, var saldo: Double) {}
// init {
//      //Executa alguma coisa durante inicialização do construtor da classe.
//    }
open class Conta (var titular: String = "", var numero: Int = 0) {
    var saldo = 0.0
        private set
    fun depositar(deposito: Double) {
        if (deposito > 0.0) {
            this.saldo += deposito
            println("Depositando R$ ${deposito} na conta do ${this.titular}...\nSaldo anterior: R$ ${this.saldo - deposito}\n" +
                    "Saldo atual: R\$ ${this.saldo}")
        }
    }

    open fun sacar(saque: Double) {
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