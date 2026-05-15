package org.example

class Complejo(private var real: Double = 0.0, private var imag: Double = 0.0) {
    
    fun sumar(otro: Complejo): Complejo {
        return Complejo(real + otro.real, imag + otro.imag)
    }

    fun restar(otro: Complejo): Complejo {
        return Complejo(real - otro.real, imag - otro.imag)
    }

    fun multiplicar(otro: Complejo): Complejo {
        return Complejo(
            real * otro.real - imag * otro.imag,
            real * otro.imag + imag * otro.real
        )
    }

    fun dividir(otro: Complejo): Complejo {
        val divisor = otro.real * otro.real + otro.imag * otro.imag
        return Complejo(
            (real * otro.real + imag * otro.imag) / divisor,
            (imag * otro.real - real * otro.imag) / divisor
        )
    }

    fun inicializar(real: Double, imag: Double) {
        this.real = real
        this.imag = imag
    }

    fun mostrar() {
        println(this.toString())
    }

    override fun toString(): String {
        val signo = if (imag >= 0) "+" else ""
        return "$real $signo ${imag}i"
    }
}


fun main() {
    val complejo = Complejo()
    complejo.inicializar(3.0, 4.0)
    println("Mi número complejo es: $complejo")
    
    val c2 = Complejo(40.0, 2.0)
    val c3 = complejo.sumar(c2)
    print("Suma ")
    c3.mostrar()
    val c4 = complejo.restar(c2)
    print("Resta ")
    c4.mostrar()
    val c5 = complejo.multiplicar(c2)
    print("Multiplicación ")
    c5.mostrar()
    val c6 = complejo.dividir(c2)
    print("División ")
    c6.mostrar()
}