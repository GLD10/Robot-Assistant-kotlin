import java.util.*
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext

data class Robot(var Name:String, var time:String) {

    fun Alarm(Day:Int,Time:String) {
        when (Day) {
            in Calendar.MONDAY..Calendar.FRIDAY -> println("Good Morning Deepak, The time is ${Time}. Please wake up!.")
            else -> println("Good Morning Deepak, The time is 10:00AM. Please wake up!.")
        }
    }
    fun MakeCoffee(coffee:Coffee){
        if(coffee.Milk){
        println("Deepak, Your coffee with milk and ${coffee.Noofspoons}spoons of sugar is ready!.")
        }
        else{
            println("Deepak, Your coffee with black and ${coffee.Noofspoons}spoons of sugar is ready!.")
        }
    }
    fun HotWater(Day:Int,Temperature:Int) {
        when (Day) {
            in Calendar.MONDAY..Calendar.FRIDAY -> println("The temperature of water in a bucket for bathing is ${Temperature}, take your bath now.")
            else -> println("Don't heat the water")
        }
    }
    fun PackBag(Day:Int){
        var Message="Name of the Books for today's class are "
        var Subject=arrayOf("Java","Maths","OS","CN","PEV","DAA","AI","Gaming")
        when(Day){
            Calendar.MONDAY -> println("${Message}${Subject[4]},${Subject[1]},${Subject[5]},${Subject[0]},${Subject[3]},${Subject[6]}.")
            Calendar.TUESDAY -> println("${Message}${Subject[1]},${Subject[2]},${Subject[4]},${Subject[0]},${Subject[5]}.")
            Calendar.WEDNESDAY -> println("${Message}${Subject[2]},${Subject[1]},${Subject[5]},${Subject[7]}.")
            Calendar.THURSDAY -> println("${Message}${Subject[3]},${Subject[6]},${Subject[0]}.")
            Calendar.FRIDAY -> println("${Message}${Subject[2]},${Subject[6]},${Subject[3]},${Subject[7]}.")
            else -> println("No books for pack today is holiday go and enjoy.")
        }
    }
    fun Cook(){
        var BreakFast= mutableListOf("Idly","Poor","Vada","Dosa","Chapati","Parota","Bonda")
        var common="Rice"
        var Lunch= mutableListOf("Dal curry","Aloo curry","Chicken Biryani","LadiesFinger fry","Sambar","Egg Fry","Any plant curry")
        var a=BreakFast.random()
        var b=Lunch.random()
        println("Today breakfast is ${a}, Lunch is ${common} with ${b} and Dinner is ${common} " +
                "with ${b} or ${a} which is aviable at that moment.")
    }
    fun IronTheClothes(ShirtColor:String,PantColor:String){
        var ShirtColors= mutableListOf("Red","Yellow","White","Black","Orange","Blue","Maroon")
        var PantColors= mutableListOf("Cream","White","Blue")
        if(ShirtColors.contains(ShirtColor)) {
            if (PantColors.contains(PantColor)) {
                println("Your clothes are ready to wear.")
            } else {
                print("You don't have the ${PantColor} color pant. Use ${PantColors.random()} color pant for now.")
            }
        }
            else{
                println("You don't have the ${ShirtColor} color shirt. Use ${ShirtColors.random()} color shirt for now.")
            }
    }
}