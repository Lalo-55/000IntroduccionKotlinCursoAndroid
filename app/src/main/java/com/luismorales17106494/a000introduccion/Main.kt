package com.luismorales17106494.a000introduccion

fun main() {

    //clase001Variables()
    clase002Clases()
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
class Persona(val nombre: String, val apellido: String) {

    fun darBienvenida() {
        println("Bienvenido $nombre $apellido")
    }

}

fun clase002Clases() {
    val persona: Persona = Persona("Lalo", "-55")
    persona.darBienvenida()
}