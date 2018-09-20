package figures

import interfaces.Describable
import interfaces.Drawable

class Square: Describable, Drawable {
    var side: Int = 0

    constructor(){
        //empty constructor
    }

    override fun descriptionRequest(){ //solicita el lado del cuadrado
        println("Please enter the length of the side of the new square")
        val sideInput = readLine()!!.toInt()
        this.side = sideInput
    }

    override fun draw(): String{ //Concatena en un string los asteriscos gracias a los ciclos que llegan hasta la longitud del lado del
        //cuadrado, por cada casilla agrega un asterisco
        var squareString = ""

        for (i in 1..this.side){
            for (i in 1..this.side){
                squareString += "* "
            }
            squareString+="\n"
        }
        return  squareString
    }
}