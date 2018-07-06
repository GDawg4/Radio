package modulo

class Radio (
        val amofm: String = "FM",
        var volumen: Int,
        var estacion: Float,
        var encendido: Boolean = false
){
    fun encenderoapagar(){
        encendido = !encendido
    }
}