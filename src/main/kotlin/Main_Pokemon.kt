
fun main(){

    //Pokemons creados para el uso de jugadores
    val charmander = Pokemon("charmander","pokemon inicial de la region de Kanto", Tipo("fuego" ),15,20)
    val jolteon = Pokemon("jolteon","evolucion eevee con un piedra", Tipo("electrico"),25,65)
    val bulbasaur = Pokemon("bulbasaur","pokemon inicial de la region de Kanto",Tipo("planta"),10,28)
    val squirtle = Pokemon("squirtle","pokemon inicial de la region de Kanto",Tipo("agua"),11,22)
    val moltres = Pokemon("moltres","pokemon legendario de tipo fuego ",Tipo("fuego"),100,90)

    val jugador1 = Jugador(charmander)
    val Tu = Jugador(jolteon)
    val jugador3 = Jugador(bulbasaur)
    val jugador4 = Jugador(squirtle)
    val Diego = Jugador(moltres)

    //Primer combate
    println("Comienza el combate..... contra el Dominguero Pepe")
    while (true){
        println("")
        println("                                  Dominguero Pepe ---> charmander vida:${jugador1.pokemon.vida}")
        println("                                                                                        ")
        println("                                                                                        ")
        println("  Tú ----> jolteon vida:${Tu.pokemon.vida}                                              ")
        println("")
        println("ataques posibles:    1-Onda voltio-10 daño    2- Trueno-15 daño \n       3-Chispas-4 daño    4-..No asignado..")
        println("Que ataque desea realizar:")
        var ataque_a_realizar = readln().toString()
        if (ataque_a_realizar != "Onda Voltio" || ataque_a_realizar != "Trueno" || ataque_a_realizar != "Chispas"){
            ataque_a_realizar = "Onda Voltio"
        }
            println("(si el daño no es el correspondiente no se realizara ataque)")
            println("que daño realiza el ataque elegido:")

            var dano_realizado = readln().toInt()

        jugador1.pokemon.recibirAtaque(Ataque(ataque_a_realizar,Tipo("electrico"),dano_realizado))
        jugador1.pokemon.vida = jugador1.pokemon.vida - dano_realizado
        if (jugador1.pokemon.vida <= 0){
            println("Ganaste al Dominguero Pepe             " +
                    "Ganaste 300&")
            break
        }
        println("")
        println("                                  Dominguero Pepe ---> charmander vida:${jugador1.pokemon.vida}")
        println("                                                                                        ")
        println("                                                                                        ")
        println("  Tú ----> jolteon vida:${Tu.pokemon.vida}                                              ")
        println("turno del Dominguero Pepe")
        println("charmander utilizo ascuas")
        Tu.pokemon.recibirAtaque(Ataque("ascuas",Tipo("fuego"),8))
        Tu.pokemon.vida = Tu.pokemon.vida - 4
        if (Tu.pokemon.vida <= 0){
            println("Perdiste contra Dominguero Pepe             " +
                    "Perdiste 300&")
            break
        }
    }


}