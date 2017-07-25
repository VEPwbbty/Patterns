package AbstractFactory

fun main(args: Array<String>) {
    val producer = FactoryProducer()
    val tankFactory = producer.createFactory(FactoryProducer.Factories.TANK_FACTORY)
    val planeFactory = producer.createFactory(FactoryProducer.Factories.PLANE_FACTORY)

    tankFactory.createTank("T34")?.shoot()
    tankFactory.createTank("TIGER")?.shoot()

    planeFactory.createPlane("P12")?.fly()
}