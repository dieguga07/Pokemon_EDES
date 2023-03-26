/**
 * # Comentarios sobre la clase [Tipo]
 *
 * Esta clase alberga un constructor, una lista [lista_tipos] y una funcion [compara_tipos]
 * @constructor Tipo
 * @author Diego Gutierrez y Esther Nieto
 * @since 1.0.0
 *
 */
open class Tipo(tipo: String){


    /**
     * Lista de tipos posibles
     */
    var lista_tipos = listOf("fuego", "planta", "agua", "electrico")
    var tipo = tipo
        get() {
            return  field
        }
        set(value) {
            if (value in lista_tipos){
                field = value
            }
        }
    /**
     * ### Funcion [CompararTipos]
     * Comparar la efectividad entre los ataques y los tipos del pokemon según los tipos que hay disponibles, que son:
     * 1. planta
     * 2. agua
     * 3. fuego
     * 4. electrico
     */
    fun CompararTipos(tipo_pokemon:String,tipo_ataque:String): Double {


        /**
         * Para ataques supereficaces (2x)
         */


        if ((tipo_pokemon == "planta" && tipo_ataque == "fuego") ||
            (tipo_pokemon == "fuego" && tipo_ataque == "agua") ||
            (tipo_pokemon == "agua" && tipo_ataque == "electrico") ||
            (tipo_pokemon == "agua" && tipo_ataque == "planta") ||
            (tipo_pokemon == "electrico" && tipo_ataque == "agua")){
            return 2.00
        }
        /**
         * Para ataques no eficaces (0.5x)
         */
        else if ((tipo_pokemon == "planta" && tipo_ataque == "agua") ||
            (tipo_pokemon == "planta" && tipo_ataque == "planta") ||
            (tipo_pokemon == "fuego" && tipo_ataque == "fuego") ||
            (tipo_pokemon == "fuego" && tipo_ataque == "planta") ||
            (tipo_pokemon == "electrico" && tipo_ataque == "electrico") ||
            (tipo_pokemon == "agua" && tipo_ataque == "fuego") ||
            (tipo_pokemon == "agua" && tipo_ataque == "agua")){
            return 0.5
        }
        /**
         * Para ataques normales (1x)
         */
        else {
            return 1.00
        }
    }
































































































}
