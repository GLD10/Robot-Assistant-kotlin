import java.util.*

fun main(){
    var robot=Robot("chinchong","6AM")
    println()
    println("Hi! My name is ${robot.Name}. I am your personal assistant.")
    println()
    robot.Alarm(Calendar.getInstance().get(Calendar.DAY_OF_WEEK),"6:00AM")
    println()
    robot.MakeCoffee(Coffee(true,2))
    println()
    robot.HotWater((Calendar.getInstance().get(Calendar.DAY_OF_WEEK)),39)
    println()
    robot.PackBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()
    robot.Cook()
    println()
    robot.IronTheClothes("White","Cream")
}