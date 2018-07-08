package modulo
// crear la clase radio
// características correspondientes
class Radio (
        var amofm: String = "FM",
        var volumen: Int,
        var estacionAM: Float = 1420F,
        var estacionFM: Float = 106.5F,
        var encendido: Boolean = false
){
    fun encenderoapagar() {
        encendido = !encendido
    }
    fun cambiarfrec(){
        if (amofm == "FM"){
            amofm = "AM"
        }
        else if (amofm == "AM"){
            amofm = "FM"
        }
    }
    fun subir_volumen(){
        volumen += 5
    }
    fun bajar_volumen(){
        volumen -= 5
    }
    fun cambiarestacion(estacionNueva:Float): String{
        if (amofm == "FM" && estacionNueva in 87.5 .. 108.00){
            estacionFM = estacionNueva
            return "Estación cambiada!"
        } else if ((amofm == "AM" && estacionNueva in 525 .. 1705)){
            estacionAM = estacionNueva
            return "Estación cambiada!"
        } else{
            return "Esta estación no está en el rango correcto, favor intentar nuevamente"
        }
        }
    override fun toString(): String {
        return """
            Actualmente está escuchando la frecuencia ${if (amofm == "FM"){estacionFM}else{estacionAM}} $amofm
            Tiene $volumen volumen""".trimIndent()
    }
}