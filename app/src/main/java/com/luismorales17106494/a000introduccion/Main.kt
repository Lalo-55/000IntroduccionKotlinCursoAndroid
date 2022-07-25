package com.luismorales17106494.a000introduccion

fun main() {

    //clase001Variables()
    //clase002Clases()
    //clase003ClasesConstructorVacio()
    //clase004DataClass()
    //clase005Constantes()
    //clase006EnumClass()
    //clase007Funciones()
    clase008ControlFlowIf()

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
fun clase007Funciones(){

    fun esPar(numero: Int): Boolean{
        return numero % 2 == 0
    }
    println(esPar(10))

}
/*008 Control flow -if */
fun clase008ControlFlowIf(){
    val a = 10
    val b = 12
    var max = a
    if (a < b)
        max = b
    println(max)

    max = if (a > b){
        a
    }else{
        b
    }
    println(max)


}
