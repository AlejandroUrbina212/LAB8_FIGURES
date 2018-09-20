package figures

import interfaces.Describable
import interfaces.Drawable

class Rectangle: Drawable,Describable {
    var length: Int = 0
    var height: Int = 0
    constructor(){
        //empty constructor
    }

    override fun descriptionRequest(){
        println("Please enter the length of the new rectangle")
        val length = readLine()!!.toInt()
        this.length = length

        println("Please enter the height of the new rectangle")
        val height = readLine()!!.toInt()
        this.height = height
    }

    override fun draw(): String{
        var rectangleString = ""

        for (i in 1..this.height){
            for (i in 1..this.length){
                rectangleString += "* "
            }
            rectangleString+="\n"
        }
        return  rectangleString
    }

}