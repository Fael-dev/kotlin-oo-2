class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double get () = super.bonificacao + (salario + plr)

    fun autenticacao(senha: Int): Boolean = this.senha == senha
}