

/**
 * # MAIN DEL PROYECTO
 * En el main hemos simulado un combate Pokemon, donde el jugador se enfrentará a Dominguero Pepe
 * Dominguero Pepe elegirá un pokemon dependiendo del que elijamos nosotros
 * El combate empieza con 3 pokemons disponibles para el jugador, de los que podrá elegir 1 al principio del combate
 */
fun main(){
    /**
     * ### Creación de los pokemons disponibles
     * El último pokemon es un pokemon legendario con un daño mayor al de los demás
     * pero solo estará disponible para el Dominguero Pepe (un truco para probar la opción de derrota es
     * usar a squirtle, que se enfrentará al pokemon legendario, y usar solo el primer ataque, de esta manera
     * Moltres nos ganará)
     */
    val charmander = Pokemon("fuego","Charmander","pokemon inicial de la region de Kanto",100)
    val jolteon = Pokemon("eléctrico","Jolteon","evolucion eevee con una piedra",65)
    val squirtle = Pokemon("agua","Squirtle","pokemon inicial de la region de Kanto",80)
    val moltres = Pokemon("fuego","Moltres","pokemon legendario de tipo fuego ",200)




    /**
     * ### Creación de los jugadores con un pokemon asignado y 3 ataques para cada pokemon
     */
    val jugador1 = Jugador(charmander)
    val ataque1_charmander = Ataque("fuego", "Arañazo", 5)
    val ataque2_charmander = Ataque("fuego","Ascuas", 10)
    val ataque3_charmander = Ataque("fuego", "Cuchillada", 15)


    val jugador2 = Jugador(jolteon)
    val ataque1_jolteon = Ataque("eléctrico", "Doble Patada", 5)
    val ataque2_jolteon = Ataque("eléctrico","Placaje", 10)
    val ataque3_jolteon = Ataque("eléctrico", "Pin Misil", 15)


    val jugador3 = Jugador(squirtle)
    val ataque1_squirtle = Ataque("agua", "Pistola Agua", 5)
    val ataque2_squirtle = Ataque("agua","Placaje", 10)
    val ataque3_squirtle = Ataque("agua", "Hidrobomba", 15)


    val jugador4 = Jugador(moltres)
    val ataque1_moltres = Ataque("agua", "Ascuas", 15)
    val ataque2_moltres = Ataque("agua","Lanzallamas", 25)
    val ataque3_moltres = Ataque("agua", "Onda ígnea", 35)


    /**
     * ## COMIENZO DEL COMBATE
     */
    println("Comienza el combate..... contra el Dominguero Pepe")
    /**
     * Esta condición de salida nos va a servir como una condición comodín que cambiará cuando uno de los jugadores pierda
     * Es una alternativa fácil para salir del while cuando la condición de salida original no es muy clara
     */
    var condicion_salida = true
    while (condicion_salida == true){
        println("¡Elige tu Pokemon!\n" +
                "(1) Charmander\n" +
                "(2) Jolteon\n" +
                "(3) Squirtle")
        var pokemon_elegido = readln().toInt()
        /**
         * Este when lleva en cada caso 1 combate entero según el pokemon que hayamos elegido
         */
        when (pokemon_elegido) {
            1 -> {
                println("Prepárate para un desafío a manos de... ¡Dominguero Pepe!")
                jugador2.pokemon.PokemonEnemigo()
                println()
                /**
                 * Este while true se rompe cuando uno de los jugadores pierde
                 * Sirve para que el jugador tenga la opción de lanzar ataques hasta que la vida baje hasta 0 o menos
                 */
                while (true){
                    println("¡Adelante, ${jugador1.pokemon.nombre_pokemon}\n" +
                            "VIDA --> ${jugador1.pokemon.vida_pokemon} HP\n" +
                            "--------------- ATAQUES POSIBLES ---------------\n" +
                            "1. ${ataque1_charmander.nombre_ataque} --------- 2. ${ataque2_charmander.nombre_ataque}\n" +
                            "3. ${ataque3_charmander.nombre_ataque} --------- 4. No asignado...\n" +
                            "------------------------------------------------")
                    var primer_ataque = readln().toInt()
                    /**
                     * Este when usa la función recibirAtaque, que va actualizando la vida de nuestros jugadores usando
                     * a su vez la función CompararTipos.
                     * Si uno de los dos pierde, la condicion de salida se vuelve false y le sigue un break,
                     * por lo que salimos de todos los bucles y termina el combate
                     */
                    when (primer_ataque) {
                        1 -> jugador2.pokemon.recibirAtaque(jugador2.pokemon.tipo, ataque1_charmander.tipo, ataque1_charmander.dano)
                        2 -> jugador2.pokemon.recibirAtaque(jugador2.pokemon.tipo, ataque2_charmander.tipo, ataque2_charmander.dano)
                        3 -> jugador2.pokemon.recibirAtaque(jugador2.pokemon.tipo, ataque3_charmander.tipo, ataque3_charmander.dano)
                    }
                    println("Vida de ${jugador1.pokemon.nombre_pokemon} ---> ${jugador1.pokemon.vida_pokemon} hp\n" +
                            "Vida de ${jugador2.pokemon.nombre_pokemon} ---> ${jugador2.pokemon.vida_pokemon} hp\n")
                    if (jugador1.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador2.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }
                    /**
                     * Ahora es momento del ataque de Dominguero Pepe
                     * Igual que arriba, usamos la función recibirAtaque para actualizar nuestra vida después de recibir daño
                     * Una vez más, si la vida de alguno de los pokemon baja a 0 o menos, acaba la partida
                     */
                    println("${jugador2.pokemon.nombre_pokemon} usó ${ataque1_jolteon.nombre_ataque}")
                    jugador1.pokemon.recibirAtaque(jugador1.pokemon.tipo, ataque1_jolteon.tipo, ataque1_jolteon.dano)
                    println("Vida de ${jugador1.pokemon.nombre_pokemon} ---> ${jugador1.pokemon.vida_pokemon} hp\n" +
                            "Vida de ${jugador2.pokemon.nombre_pokemon} ---> ${jugador2.pokemon.vida_pokemon} hp\n")
                    if (jugador1.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador2.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }
                }


            }
            /**
             * Igual pero seleccionando el segundo pokemon disponible
             */
            2 -> {
                println("Prepárate para un desafío a manos de... ¡Dominguero Pepe!")
                jugador3.pokemon.PokemonEnemigo()
                println()
                while (true){
                    println("¡Adelante, ${jugador2.pokemon.nombre_pokemon}\n" +
                            "VIDA --> ${jugador2.pokemon.vida_pokemon} HP\n" +
                            "--------------- ATAQUES POSIBLES ---------------\n" +
                            "1. ${ataque1_jolteon.nombre_ataque} --------- 2. ${ataque2_jolteon.nombre_ataque}\n" +
                            "3. ${ataque3_jolteon.nombre_ataque} --------- 4. No asignado...\n" +
                            "------------------------------------------------")
                    var primer_ataque = readln().toInt()
                    when (primer_ataque) {
                        1 -> jugador3.pokemon.recibirAtaque(jugador3.pokemon.tipo, ataque1_jolteon.tipo, ataque1_jolteon.dano)
                        2 -> jugador3.pokemon.recibirAtaque(jugador3.pokemon.tipo, ataque2_jolteon.tipo, ataque2_jolteon.dano)
                        3 -> jugador3.pokemon.recibirAtaque(jugador3.pokemon.tipo, ataque3_jolteon.tipo, ataque3_jolteon.dano)
                    }
                    println("Vida de ${jugador2.pokemon.nombre_pokemon} ---> ${jugador2.pokemon.vida_pokemon}\n" +
                            "Vida de ${jugador3.pokemon.nombre_pokemon} ---> ${jugador3.pokemon.vida_pokemon}\n")
                    if (jugador2.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador3.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }
                    println("${jugador3.pokemon.nombre_pokemon} usó ${ataque1_squirtle.nombre_ataque}")
                    jugador2.pokemon.recibirAtaque(jugador2.pokemon.tipo, ataque1_squirtle.tipo, ataque1_squirtle.dano)
                    println("Vida de ${jugador2.pokemon.nombre_pokemon} ---> ${jugador2.pokemon.vida_pokemon} hp\n" +
                            "Vida de ${jugador3.pokemon.nombre_pokemon} ---> ${jugador3.pokemon.vida_pokemon} hp\n")
                    if (jugador2.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador3.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }

                }

            }
            /**
             * Igual pero seleccionando el tercer y último pokemon disponible
             */
            3 -> {
                println("Prepárate para un desafío a manos de... ¡Dominguero Pepe!")
                jugador4.pokemon.PokemonEnemigo()
                println()
                while (true){
                    println("¡Adelante, ${jugador3.pokemon.nombre_pokemon}\n" +
                            "VIDA --> ${jugador3.pokemon.vida_pokemon} HP\n" +
                            "--------------- ATAQUES POSIBLES ---------------\n" +
                            "1. ${ataque1_squirtle.nombre_ataque} --------- 2. ${ataque2_squirtle.nombre_ataque}\n" +
                            "3. ${ataque3_squirtle.nombre_ataque} --------- 4. No asignado...\n" +
                            "------------------------------------------------")
                    var primer_ataque = readln().toInt()
                    when (primer_ataque) {
                        1 -> jugador4.pokemon.recibirAtaque(jugador4.pokemon.tipo, ataque1_squirtle.tipo, ataque1_squirtle.dano)
                        2 -> jugador4.pokemon.recibirAtaque(jugador4.pokemon.tipo, ataque2_squirtle.tipo, ataque2_squirtle.dano)
                        3 -> jugador4.pokemon.recibirAtaque(jugador4.pokemon.tipo, ataque3_squirtle.tipo, ataque3_squirtle.dano)
                    }
                    println("Vida de ${jugador3.pokemon.nombre_pokemon} ---> ${jugador3.pokemon.vida_pokemon}\n" +
                            "Vida de ${jugador4.pokemon.nombre_pokemon} ---> ${jugador4.pokemon.vida_pokemon}\n")
                    if (jugador3.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador4.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }
                    println("${jugador4.pokemon.nombre_pokemon} usó ${ataque1_moltres.nombre_ataque}")
                    jugador3.pokemon.recibirAtaque(jugador3.pokemon.tipo, ataque1_moltres.tipo, ataque1_moltres.dano)
                    println("Vida de ${jugador3.pokemon.nombre_pokemon} ---> ${jugador3.pokemon.vida_pokemon} hp\n" +
                            "Vida de ${jugador4.pokemon.nombre_pokemon} ---> ${jugador4.pokemon.vida_pokemon} hp\n")
                    if (jugador3.pokemon.vida_pokemon <= 0) {
                        println("¡Oh no, fuiste derrotado por Dominguero Pepe! ¡Fin de la partida!")
                        condicion_salida = false
                        break
                    }
                    else if (jugador4.pokemon.vida_pokemon <= 0) {
                        println("¡Enhorabuena, has derrotado a Dominguero Pepe! +300 exp")
                        condicion_salida = false
                        break
                    }
                }
            }
        }
    }


}

    /**
     * # FIN DEL PROGRAMA
     */

