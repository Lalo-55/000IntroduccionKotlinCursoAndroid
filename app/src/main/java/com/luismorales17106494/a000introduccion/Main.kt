package com.luismorales17106494.a000introduccion

fun main() {

    //clase001Variables()
    //clase002Clases()
    clase003ClasesConstructorVacio()
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
class Persona2(var nombre: String = "", var apellido: String = "") {

    fun darBienvenida(): String {
        return "Bienvenido $nombre $apellido"
    }

}
fun clase003ClasesConstructorVacio() {
    val persona: Persona2 = Persona2("Lalo", "-55")
    val persona2 = Persona2()

    println("Persona1:  ${persona.darBienvenida()}")
    println("Persona2:  ${persona2.darBienvenida()}")


    persona2.nombre = "Edu"
    persona2.apellido = "lalo"

    println("Persona2:  ${persona2.darBienvenida()}")
}