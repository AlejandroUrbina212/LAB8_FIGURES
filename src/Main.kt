
import figures.Rectangle
import figures.Square
import figures.Triangle
import interfaces.Describable
import interfaces.Drawable

fun menu(selection: Int): String {
    var menuString: String
    menuString = if (selection == 1) {
        """
        1. Dibujar una Figura
        2. Salir

    """.trimIndent()
    } else {
        """
        1. Dibujar un cuadrado
        2. Dibujar un rectangulo
        3. Dibujar un triangulo
        4. Salir al menu principal

    """.trimIndent()
    }
    return menuString
}

fun requestDescription(describable: Describable){
    describable.descriptionRequest()
}
fun draw(drawable: Drawable){
    print(drawable.draw())

}

fun main(args: Array<String>){
    do{
        println("Ingrese una opción del menú")
        println(menu(1))

        var wantsToContinue = readLine()!!.toInt()

        do {
            println("Ingrese una opción de figura a dibujar")
            print(menu(2))
            var menuSelection = readLine()!!.toInt()

            when(menuSelection) {
                1 -> {
                    val square = Square()
                    requestDescription(square)
                    draw(square)


                }
                2->{
                    val rectangle = Rectangle()
                    requestDescription(rectangle)
                    draw(rectangle)
                }
                3->{
                    val triangle = Triangle()
                    requestDescription(triangle)
                    draw(triangle)
                }
            }

        }while (menuSelection!=4)

    }while (wantsToContinue != 2)
}
