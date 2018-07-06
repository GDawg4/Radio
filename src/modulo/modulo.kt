package modulo

class Radio (
        val amofm: String = "FM",
        var volumen: Int,
        var estacion: Float,
        var encendido: Boolean = false
){
    fun encenderoapagar() {
        encendido = !encendido
    }
    fun subir_volumen(){
        volumen += 5
    }
    fun bajar_volumen(){
        volumen -= 5
    }
    fun defestacion(buscar:Float){
        estacion = buscar
    }
    override fun toString(): String {
        return """
            El radio está en la frecuencia $estacion $amofm
            Tiene $volumen volumen""".trimIndent()
    }
}