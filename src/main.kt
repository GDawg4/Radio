import modulo.Radio

//Rodrigo Garoz 18102
//Radio

fun main(args: Array<String>){
    val radio1 = Radio(
            amofm = "FM",
            volumen = 15,
            estacion = 106.5F
    )
    println(radio1.toString())
    radio1.bajar_volumen()
    println(radio1.toString())
}