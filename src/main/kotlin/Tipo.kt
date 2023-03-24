/**
 * # Comentarios sobre la clase [Tipo]
 *
 * Esta clase alberga un constructor, una lista [lista_tipos] y una funcion [compara_tipos]
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
                println("Ese tipo no existe")
            }
            else{
                field = value
            }

        }
    /**
     * ### Funcion [compara_tipos]
     *Comparar la efectividad entre los ataques y los tipos del pokemon según los tipos que hay que son:
     * 1. planta
     * 2. agua
     * 3. fuego
     * 4. electrico
     */
    fun compara_tipos(tipo_pokemon:String,tipo_ataque:String){
        /*
        Nota:
         Increible ese ataque es supereficaz, sigue asi.. es ---> 2x de daño
         Vaya... ese ataque no es muy eficaz ----> 0.5X de daño
         Buen ataque.... -----> 1x de daño
         */

        //Para tipo planta
        if (tipo_pokemon == "planta" && tipo_ataque == "fuego"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }
        if (tipo_pokemon == "planta" && tipo_ataque == "agua"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        if (tipo_pokemon == "planta" && tipo_ataque == "planta"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        //Para tipo fuego
        if (tipo_pokemon == "fuego" && tipo_ataque == "electrico"){
            println("Buen ataque....")
        }
        if (tipo_pokemon == "fuego" && tipo_ataque == "agua"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }
        if (tipo_pokemon == "fuego" && tipo_ataque == "fuego"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        if (tipo_pokemon == "fuego" && tipo_ataque == "planta"){
            println("Vaya... ese ataque no es muy eficaz")
        }
       //Para tipo agua
        if (tipo_pokemon == "agua" && tipo_ataque == "electrico"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }
        if (tipo_pokemon == "agua" && tipo_ataque == "planta"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }
        if (tipo_pokemon == "agua" && tipo_ataque == "fuego"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        if (tipo_pokemon == "agua" && tipo_ataque == "agua"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        //Para tipo electrico
        if (tipo_pokemon == "electrico" && tipo_ataque == "electrico"){
            println("Vaya... ese ataque no es muy eficaz")
        }
        if (tipo_pokemon == "electrico" && tipo_ataque == "planta"){
            println("Buen ataque....")
        }
        if (tipo_pokemon == "electrico" && tipo_ataque == "fuego"){
            println("Buen ataque....")
        }
        if (tipo_pokemon == "electrico" && tipo_ataque == "agua"){
            println("Increible ese ataque es supereficaz, sigue asi....")
        }



    }
























}