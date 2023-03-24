/**
 * # Comentarios sobre la clase [Pokemon]
 *
 * Esta clase alberga un constructor y una funcion [recibirAtaque]
 * @constructor Pokemon
 * @author Diego Gutierrez y Esther Nieto
 * @since 1.0.0
 */
 class Pokemon(nombre: String, lore: String, tipo:Tipo, fuerza:Int, vida:Int) {

    //variables que posee la clase
     var nombre = nombre
     var lore = lore
     var fuerza = fuerza
     var vida = vida

// funcion para recibir un ataque de otro jugador

     fun recibirAtaque(ataque_recibido: Ataque) {

         if ("duplicado" == "") {
             var ataque = ataque_recibido.dano * 2
             vida - ataque
         }
         if ("normal" == "") {
             var ataque = ataque_recibido.dano * 1
           vida - ataque
         }
         if ("mitad" == "") {
             var ataque = ataque_recibido.dano * 0.5
             vida - ataque
         }

     }
 }
