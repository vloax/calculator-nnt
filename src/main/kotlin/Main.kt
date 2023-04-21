import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    var  selectOption: Int = 0;

    println("\nBem-Vindo - Calculadora! ;D")

    while (selectOption != 7) {
        println("\nSelecione uma opção:")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("5 - Raiz Quadrada")
        println("6 - Potência")
        println("7 - Sair\n")
        print("Digite a opção desejada: ")
        selectOption = readln().toInt()

        when(selectOption)
        {
            1 -> soma()
            2 -> subtracao()
            3 -> multiplicacao()
            4 -> divisao()
            5 -> raizQuadrada()
            6 -> potencia()
            7 -> println("\nPrograma finalizado!\n")
            else -> println("Opção inválida!\n")
        }
    }

}

fun soma() {
    println("\nVocê escolheu a opção de soma!\n")

    print("Digite o primeiro número: ")
    val numero1 = readln().toDouble()

    print("\nDigite o segundo número: ")
    val numero2 = readln().toDouble()

    println("\nO resultado da soma é: ${numero1 + numero2}\n")
}

fun subtracao() {
    println("Você escolheu a opção de subtração!\n")

    print("Digite o primeiro número: ")
    val numero1 = readln().toDouble()

    print("\nDigite o segundo número: ")
    val numero2 = readln().toDouble()

    println("\nO resultado da subtração é: ${numero1 - numero2}")
}

fun multiplicacao() {
    println("\nVocê escolheu a opção de multiplicação!\n")

    print("Digite o primeiro número: ")
    val numero1 = readln().toDouble()

    print("\nDigite o segundo número: ")
    val numero2 = readln().toDouble()

    println("\nO resultado da multiplicação é: ${numero1 * numero2}\n")

}

fun divisao() {
    println("Você escolheu a opção de divisão!\n")

    print("Digite o primeiro número: ")
    val numero1 = readln().toDouble()

    print("\nDigite o segundo número: ")
    val numero2 = readln().toDouble()

    println("\nO resultado da divisão é: ${numero1 / numero2}\n")
}

fun raizQuadrada() {
    println("Você escolheu a opção de raiz quadrada!\n")

    print("Digite o número: ")
    val numero1 = readln().toDouble()

    println("\nO resultado da raiz quadrada é: ${sqrt(numero1)}\n}")
}

fun potencia() {
    println("\nVocê escolheu a opção de potência!\n")

    print("Digite o primeiro número: ")
    val numero1 = readln().toDouble()

    print("\nDigite o segundo número: ")
    val numero2 = readln().toDouble()

    println("\nO resultado da potência é: ${numero1.pow(numero2)}\n")
}