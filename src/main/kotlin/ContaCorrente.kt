class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
) {
    override fun sacar(saque: Double) {
        val valorComTaxa = saque + (saque*0.1)
        super.sacar(valorComTaxa)
    }
}