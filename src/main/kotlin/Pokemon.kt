
/**
 * # Comentarios sobre la clase [Pokemon]
 *
 * Esta clase alberga un constructor y una funcion [recibirAtaque]
 * @constructor Pokemon
 * @author Diego Gutierrez y Esther Nieto
 * @since 1.0.0
 */
class Pokemon(tipo_pokemon: String, nombre_pokemon: String, lore_pokemon: String, vida_pokemon:Int): Tipo(tipo_pokemon) {


    /**
     * Variables de la clase [Pokemon]
     */


    var nombre_pokemon = nombre_pokemon
    var lore_pokemon = lore_pokemon
    var vida_pokemon = vida_pokemon


    /**
     * Funcion para recibir un ataque de otro jugador
     * @param tipo_pokemon es el tipo del pokemon aliado
     * @param ataque_recibido es el tipo del ataque enemigo
     * @param danio_pokemon es el daño del pokemon enemigo
     */
    // funcion para recibir un ataque de otro jugador
    //Vamos a pedir los datos necesarios para usar la función CompararTipos en esta
    fun recibirAtaque(tipo_pokemon:String, ataque_recibido: String, danio_pokemon: Int): Int {


        var efectividad_a_multiplicar = CompararTipos(tipo_pokemon, ataque_recibido)
        var ataque = danio_pokemon * efectividad_a_multiplicar
        vida_pokemon = (vida_pokemon - ataque).toInt()
        return vida_pokemon
    }


    /**
     * Para facilitar la presentación en el main, hemos hecho esta función
     */
    fun PokemonEnemigo(): String {
        return "¡Dominguero Pepe saca a $nombre_pokemon!\n" +
                "-- $nombre_pokemon --------- $vida_pokemon hp --"
    }




}
