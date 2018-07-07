import modulo.Radio

//Rodrigo Garoz 18102
//Radio

fun main(args: Array<String>){
    var ingreso = ""
    val radio1 = Radio(
            amofm = "FM",
            volumen = 15,
            estacion = 106.5F
    )
    while (ingreso != "Salir" ){
        if (radio1.encendido == false){
            println("Su radio está apagado, ingrese \"1\" para encender")
            var ingreso = readLine()!!
        }
    }
}