package figures

import interfaces.Describable
import interfaces.Drawable

class Triangle: Describable, Drawable {
    var height: Int = 0

    constructor(){
        //empty constructor
    }

    override fun descriptionRequest(){
        println("Please enter the height of the new triangle")
        val heightInput = readLine()!!.toInt()
        this.height = heightInput
    }

    override fun draw(): String{
        var triangleString = ""
        for (i in 0 until this.height) { //concatena en un string el resultado
            for (m in i until this.height) {
                triangleString+=" "
            }
            for (j in 0..i) {
                triangleString += if (i != this.height - 1)
                    if (j == 0 || j == i) // en las casillas en las que se unan ambos ciclos
                        //altura y ancho, concatena un asterisco
                        "*"
                    else
                        "*"
                else
                    "*"
                triangleString+=" "
            }
            triangleString+="\n" //salto de linea por cada una de las líneas del triángulo
        }

        return triangleString
    }
}