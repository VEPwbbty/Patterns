package AbstractFactory

class PlaneFactory : AbstractFactory {

    override fun createPlane(typeOfPlane: String) = try {
        types.valueOf(typeOfPlane).create()
    } catch (e: IllegalArgumentException) {
        null
    }

    override fun createTank(typeOfTank: String) = null

    enum class types {
        P12 {
            override fun create() = P12()
        },
        P54 {
            override fun create() = P54()
        };

        abstract fun create(): Plane
    }
}

class P12 : Plane {
    override fun fly() = println("P12 is flying")
}

class P54 : Plane {
    override fun fly() = println("P54 is flying")
}

interface Plane {
    fun fly()
}