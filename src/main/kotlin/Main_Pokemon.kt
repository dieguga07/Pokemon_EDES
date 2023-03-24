
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


        println("Comienza el combate... \n El Dominguero Diego te reta a un combate:")
        println("")
        println("                                  jugador1 ---> charmander vida:${jugador1.pokemon.vida}")
        println("                                                                                   ")
        println("                                                                                   ")
        println("  Tú ----> jolteon vida:${Tu.pokemon.vida}                                              ")

    println("El jugador 1 utilizo ascuas")
    Tu.pokemon.recibirAtaque(Ataque("ascuas",Tipo("fuego"),8))
    Tu.pokemon.vida = Tu.pokemon.vida - 8
    println("Comienza el combate... \n El Dominguero Diego te reta a un combate:")
    println("")
    println("                                  jugador1 ---> charmander vida:${jugador1.pokemon.vida}")
    println("                                                                                   ")
    println("                                                                                   ")
    println("  Tú ----> jolteon vida:${Tu.pokemon.vida}                                              ")
    jugador1.pokemon.recibirAtaque(Ataque("chispas",Tipo("electrico"),4))
   jugador1.pokemon.vida = jugador1.pokemon.vida - 3
    Tu.pokemon.recibirAtaque(Ataque("ascuas",Tipo("fuego"),8))
    Tu.pokemon.vida - 8
    println("Comienza el combate... \n El Dominguero Diego te reta a un combate:")
    println("")
    println("                                  jugador1 ---> charmander vida:${jugador1.pokemon.vida}")
    println("                                                                                   ")
    println("                                                                                   ")
    println("  Tú ----> jolteon vida:${Tu.pokemon.vida}                                              ")
    jugador3.pokemon.recibirAtaque(Ataque("ascuas",Tipo("fuego"),8))
    println(jugador3.pokemon.vida)
    jugador4.pokemon.recibirAtaque(Ataque("ascuas",Tipo("fuego"),8))
    println(jugador4.pokemon.vida)

}