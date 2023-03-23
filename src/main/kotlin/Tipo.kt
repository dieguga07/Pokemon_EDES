


class Tipo(tipo:String){

    var lista_tipos = listOf("fuego","planta","agua","electrico")
    var tipo = tipo
            /* Introducimos esto para evitar tipos de pokemons no deseados asignando
            uno por defecto si no no esta en la lista de tipos */

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
    /* funcion que recibe un tipo de pokemon y el ataque, para comparar la efectividad de un ataque */

    // sin terminar
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