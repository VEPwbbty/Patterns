package Builder

fun main(args: Array<String>) {
    val car = SportCar(name = "Audi", color = "green")
    println(car.name)
    println(car.color)
    println(car.maxSpeed)
}

class SportCar(val name: String, val color: String = "black", val maxSpeed: Int = 200)