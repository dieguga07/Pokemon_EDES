class Pokemon(nombre: String, lore: String, tipo:Tipo, fuerza:Int, vida:Int) {

     var nombre = nombre
     var lore = lore
     var fuerza = fuerza
     var vida = vida

// funcion para recibir un ataque de otro jugador

     fun recibirAtaque(ataque_recibido: Ataque) {

         if ("duplicado" == "aqui va el resultado de la funcion de tipo") {
             var ataque = ataque_recibido.dano * 2
             vida - ataque
         }
         if ("normal" == "aqui va el resultado de la funcion de tipo") {
             var ataque = ataque_recibido.dano * 1
             vida - ataque
         }
         if ("mitad" == "aqui va el resultado de la funcion de tipo") {
             var ataque = ataque_recibido.dano * 0.5
             vida - ataque
         }

     }
 }
