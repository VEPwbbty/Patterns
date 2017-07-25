package Factory

fun main(args: Array<String>) {
    val factory = Factory()
    val audi = factory.create(Factory.Type.AUDI)
    val kia = factory.create(Factory.Type.KIA)

    audi.drive()
    kia.drive()
}

interface Car {
    fun drive()
}

class Kia : Car {
    override fun drive() = println("drive Kia")
}

class Toyota : Car {
    override fun drive() = println("drive Toyota")
}

class Audi : Car {
    override fun drive() = println("drive Audi")
}

class Factory {
    enum class Type {
        TOYOTA, KIA, AUDI;
    }

    fun create(typeOfCar: Type) = when (typeOfCar) {
        Type.TOYOTA -> Toyota()
        Type.AUDI -> Audi()
        Type.KIA -> Kia()
    }
}