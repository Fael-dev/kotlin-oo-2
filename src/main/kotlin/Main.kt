fun main() {
    println("Bem-vindo ao Bytebank")

    val funcionario = Funcionario(
        "Rafael",
        "000.000.000-00",
        1200.00
    )

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salário: ${funcionario.salario}")
    println("Bonificação: ${funcionario.bonificacao()}")
}