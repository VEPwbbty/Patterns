package AbstractFactory

class TankFactory : AbstractFactory {
    override fun createPlane(typeOfPlane: String) = null

    override fun createTank(typeOfTank: String) = try {
        types.valueOf(typeOfTank).create()
    } catch (e: IllegalArgumentException) {
        null
    }

    enum class types {
        T34 {
            override fun create() = T34()
        },
        TIGER {
            override fun create() = TIGER()
        };

        abstract fun create(): Tank
    }
}

class T34 : Tank {
    override fun shoot() = println("T34 is shooting")
}

class TIGER : Tank {
    override fun shoot() = println("TIGER is shooting")
}

interface Tank {
    fun shoot()
}