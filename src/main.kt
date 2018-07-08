import modulo.*

//Rodrigo Garoz 18102
//Radio

fun main(args: Array<String>){
    var ingreso = ""
    val radio1 = Radio(
            amofm = "FM",
            volumen = 15
    )
    while (ingreso != "6" ){
        while (!radio1.encendido && ingreso != "6"){
            println("Su radio está apagada, favor ingrese \"1\" para encenderlo o \"2\" para salir del programa")
            ingreso = readLine()!!
            if (ingreso == "1"){
                radio1.encenderoapagar()
                println("Su radio ha sido encendido!")
            }
            else if (ingreso == "2"){
                ingreso = "6"
            }
        }
        println(radio1.toString() + """
            |Qué desea hacer (favor ingresar el número de opción que desea ejecutar)?
            |1. Cambiar AM o FM
            |2. Subir volumen (incrementos de 5)
            |3. Bajar volumen (incrementos de 5)
            |4. Buscar estación específica
            |5. Apagar radio
            |6. Salir del programa
        """.trimMargin())
        ingreso = readLine()!!
        when (ingreso){
            "1" -> {
                radio1.cambiarfrec()
                println("Frecuencia cambiada a ${radio1.amofm}")
            }
            "2" -> {
                radio1.subir_volumen()
                println("Volmen subido, nivel actual es ${radio1.volumen}")
            }
            "3" -> {
                radio1.bajar_volumen()
                println("Volumen bajado, nivel actual es ${radio1.volumen}")
            }
            "4" -> {
                println("""Qué estación desea buscar? (87.5 a 108 en FM y 525 a 1705 en AM)""")
                val nueva = readLine()!!
                println(radio1.cambiarestacion(estacionNueva = nueva.toFloat()))
            }
            "5" -> {
                radio1.encenderoapagar()
                println("Radio apagada")
            }
        }
    }
}