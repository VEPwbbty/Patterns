package Prototype

class Student(var age: Int, var name: String) : Cloneable {
    override public fun clone() = super.clone() as Student

    override fun toString() = "Student: age = $age, name = $name, origin string ${super.toString()}"
}