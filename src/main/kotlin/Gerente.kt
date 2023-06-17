class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double get () = super.bonificacao + salario

    fun autenticacao(senha: Int): Boolean = this.senha == senha
}