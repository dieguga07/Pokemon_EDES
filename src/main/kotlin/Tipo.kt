/**
 * # Comentarios sobre la clase [Tipo]
 *
 * Esta clase alberga un constructor una lista [lista_tipos] y una funcion [compara_tipos]
 * @constructor Tipo
 * @author Diego Gutierrez y Esther Nieto
 * @since 1.0.0
 *
 */

class Tipo(tipo:String){

    var lista_tipos = listOf("fuego","planta","agua","electrico")
    var tipo = tipo
        get() {
            return  field
        }
        set(value) {
            if (value !in lista_tipos){
                println("Ese tipo no existe, se le asignara uno existente")
            }
            else{

            }
        }

    /**
     * ### Funcion [compara_tipos]
     *Comparar la efectividad entre los ataques y los tipos del pokemon según los tipos que hay
     */
    fun compara_tipos(tipo_pokemon:String,tipo_ataque:String){

        if (tipo_pokemon == "planta" && tipo_ataque == "fuego"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }
        if (tipo_pokemon == "planta" && tipo_ataque == "agua"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        if (tipo_pokemon == "planta" && tipo_ataque == "electrico"){
            println("Buen ataque....")
        }

    }
























}