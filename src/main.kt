import modulo.*

//Rodrigo Garoz 18102
//Radio

fun main(args: Array<String>){
    var ingreso = ""
    val radio1 = Radio(
            amofm = "FM",
            volumen = 10
    )
    while (ingreso != "6" ){
        while (!radio1.encendido) {
            println("Su radio está apagada, favor ingrese \"1\"")
            ingreso = readLine()!!
            if (ingreso == "1") {
                radio1.encenderoapagar()
                println("Su radio ha sido encendido!")
            }
        }
        println(radio1.toString() + """
            |
            |Qué desea hacer? (favor ingresar el número de opción que desea ejecutar)
            |1. Cambiar AM o FM
            |2. Subir volumen (incrementos de 5)
            |3. Bajar volumen (incrementos de 5)
            |4. Buscar estación específica
            |5. Apagar radio
            |6. Salir
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
                try{
                    println(radio1.cambiarestacion(estacionNueva = nueva.toFloat()))
                } catch (e:NumberFormatException){
                    println("Esta opción no es válida, favor intentar nuevamente")
                }

            }
            "5" -> {
                radio1.encenderoapagar()
                println("Radio apagada")
            }
        }
    }
}