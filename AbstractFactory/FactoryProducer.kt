package AbstractFactory

interface AbstractFactory {
    fun createTank(typeOfTank: String): Tank?
    fun createPlane(typeOfPlane: String): Plane?
}

class FactoryProducer {
    enum class Factories {
        TANK_FACTORY, PLANE_FACTORY;
    }

    fun createFactory(typeOfFactories: Factories): AbstractFactory = when(typeOfFactories) {
        Factories.TANK_FACTORY -> TankFactory()
        Factories.PLANE_FACTORY -> PlaneFactory()
    }
}