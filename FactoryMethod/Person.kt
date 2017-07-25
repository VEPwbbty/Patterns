package FactoryMethod

fun main(args: Array<String>) {
    val human = Person.getPerson()
}

class Person private constructor() {
    companion object {
        fun getPerson() = Person()
    }
}