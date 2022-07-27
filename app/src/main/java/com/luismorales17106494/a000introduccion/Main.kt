package com.luismorales17106494.a000introduccion

import java.lang.IllegalArgumentException

fun main() {

    //clase001Variables()
    //clase002Clases()
    //clase003ClasesConstructorVacio()
    //clase004DataClass()
    //clase005Constantes()
    //clase006EnumClass()
    //clase007Funciones()
    //clase008ControlFlowIf()
    //clase008ControlFlowFor()
    //clase008ControlFlowWhen()
    //clase008ControlFlowWhileDoWhile()
    //clase009ExtensionFunctions()
    //clase010Nullabilidad()
    clase011IntroduccionGenericos()

}

/*001 Variables*/
fun clase001Variables() {
    //Java
    //final Int a = 2;
    //Int b = 2;
    //int c = a + b;

    //Kotlin
    val a: Int = 2
    var b: Int = 2
    var c: Int = a + b
    println(c)


}

/*002 Clases*/
class Persona(private val nombre: String, private val apellido: String) {

    fun darBienvenida() {
        println("Bienvenido $nombre $apellido")
    }

}

fun clase002Clases() {
    val persona: Persona = Persona("Lalo", "-55")
    persona.darBienvenida()
}

/*003 Clases con Contructor vacio*/
class Persona2(var nombre: String = "", var apellido: String = "", i: Int) {

    fun darBienvenida(): String {
        return "Bienvenido $nombre $apellido"
    }

}

fun clase003ClasesConstructorVacio() {
    val persona: Persona2 = Persona2("Lalo", "-55", 34)
    val persona2 = Persona2(i = 34)

    println("Persona1:  ${persona.darBienvenida()}")
    println("Persona2:  ${persona2.darBienvenida()}")


    persona2.nombre = "Edu"
    persona2.apellido = "lalo"

    println("Persona2:  ${persona2.darBienvenida()}")
}

/*004 Data class */
data class User(val nombre: String, val edad: Int) {}

fun clase004DataClass() {
    val usuario = User("Lalo", 25)
    val usuario2 = usuario.copy(nombre = "Edu", edad = 50)
    val usuario3 = usuario.copy()


    println("Usuario 1: $usuario")
    println("Usuario 2: $usuario2")
    println("Usuario 3: $usuario3")
    println("Son iguales ${usuario.equals(usuario2)}")
}

/*005 Constantes*/
const val fecha = "20 de Julio"
fun clase005Constantes() {
    println(fecha)
    println(Constantes.fecha)


}

class Constantes {
    companion object {
        const val fecha = "25 de Julio"
    }
}


/*006 Enum Clases*/
enum class DIAS(val numero: Int) {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7)

}

fun clase006EnumClass() {
    val diaLunes = DIAS.LUNES.numero
    val diaMartes = DIAS.MARTES
    println(diaLunes)
    println(diaMartes)

    var estado = ESTADO.STOP
    println(estado.descripcion())
    estado = ESTADO.PLAY
    println(estado.descripcion())
    estado = ESTADO.STOP
    println(estado.descripcion())


}

enum class ESTADO {
    PLAY,
    PAUSE,
    STOP;

    fun descripcion(): String {
        return when (this) {
            PLAY -> "El estado es PLAY"
            PAUSE -> "El estado es PAUSE"
            STOP -> "El estado es STOP"

        }
    }

}

/*007 Funciones */
fun clase007Funciones() {

    fun esPar(numero: Int): Boolean {
        return numero % 2 == 0
    }
    println(esPar(10))

}

/*008 Control flow -if */
fun clase008ControlFlowIf() {
    val a = 10
    val b = 12
    var max = a
    if (a < b)
        max = b
    println(max)

    max = if (a > b) {
        a
    } else {
        b
    }
    println(max)


}

/*008 Control flow -for*/
fun clase008ControlFlowFor() {
    var listaMutable = mutableListOf<String>("Lalo", "lalo2", "lalo3", "lalo4")
    var listaInmutable = listOf<String>("auto", "automovil", "Bicicleta")

    //for
    for (nombre in listaMutable) {
        println(nombre)
    }
    for ((index, value) in listaMutable.withIndex()) {
        println("nombre: $value con indice: $index")
    }


    // forEach
    listaInmutable.forEach { elemento ->
        println(elemento)

    }
    listaInmutable.forEachIndexed { index, elemento ->
        println("elemento: $elemento con indice: $index")
    }


}

/*008 Control flow -When*/
fun clase008ControlFlowWhen() {
    val x = 0

    when (x) {
        1 -> {
            println("X es 1")
        }
        2 -> {
            println("X es 2")
        }
        3 -> {
            println("X es 3")
        }
        else -> {
            println("X no corresponde a ninguna funcion declarada")
        }
    }

}

/*008 Control flow -While y Do While*/
fun clase008ControlFlowWhileDoWhile() {
    //while
    var i = 0
    while (i <= 5) {
        println("Valor $i")
        i++
    }

    var suma = 0
    var input: String
    do {
        print("Ingresa un numero: ")
        input = readln()
        suma += input.toInt()

    } while (input != "0")
    println("La suma es $suma")
}

/*009 Extension Functions*/
fun clase009ExtensionFunctions() {

    //Extension Functions de ejemplo
    val nombre = "LALO"
    println(nombre.toLowerCase())

    val numero = 100
    println(numero.toDouble())

    println(nombre.removerPrimerElemento())
    println(nombre.removerUltimoElemento())


}

fun String.removerPrimerElemento(): String {
    return this.substring(1)
}

fun String.removerUltimoElemento(): String = this.substring(0, this.length - 1)


/*010 Nullabilidad*/
fun clase010Nullabilidad() {
    val nombre: String? = "Lalo"
    val c = nombre?.length ?: "lalo".length

    println(c)
    println(nombre?.length ?: "No hay nombre")

    nombre?.let {
        println(it.uppercase())
    }


    /* evitar hacer esto
    println(nombre!!.length)
     */
}

/*011 Introducción a Genericos*/
fun clase011IntroduccionGenericos() {

    Elemento(Persona1("lalo", "55", 33))
    Elemento("Esto es una cadena de texto")
    Elemento(50)
    Elemento(50.6)
    Elemento(false)



}

data class Persona1(val nombre: String, val apellido: String, val age: Int)

class Elemento<T>(value: T? = null) {

    init {
        if (value == null)
            throw IllegalArgumentException("Se inicio con un valor vacio")
        println("El valor es ${value}")

    }
}
