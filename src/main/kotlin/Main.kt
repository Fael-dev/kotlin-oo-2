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

    val gerente = Gerente(
        nome = "Rafael",
        cpf = "000.000.000-00",
        salario = 1200.00,
        senha = 12345678
    )

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificacao()}")

    if (gerente.autenticacao(12345678)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação")
    }
}