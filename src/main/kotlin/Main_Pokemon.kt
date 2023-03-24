
fun main(){

    //Pokemons creados para el uso de jugadores
    val charmander = Pokemon("charmander","pokemon inicial de la region de Kanto", Tipo("fuego" ),15,20)
    val jolteon = Pokemon("jolteon","evolucion eevee con un piedra", Tipo("electrico"),25,65)
    val bulbasaur = Pokemon("bulbasaur","pokemon inicial de la region de Kanto",Tipo("planta"),10,28)
    val squirtle = Pokemon("squirtle","pokemon inicial de la region de Kanto",Tipo("agua"),11,22)


    val jugador1 = Jugador(charmander)
    val jugador2 = Jugador(jolteon)
    val jugador3 = Jugador(bulbasaur)
    val jugador4 = Jugador(squirtle)






}