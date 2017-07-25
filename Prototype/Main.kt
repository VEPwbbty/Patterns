package Prototype

fun main(args: Array<String>) {
    val originStudent = Student(12, "Vasya")
    val cache = Cache(originStudent)

    println("test1")
    val s1 = cache.clone
    println("Clone - $s1")
    println("Origin clone - ${cache.originClone}")
    println("Origin - $originStudent")

    originStudent.age = 34
    originStudent.name = "Petya"

    println("test2")
    val s2 = cache.clone
    println("Clone - $s2")
    println("Origin clone - ${cache.originClone}")
    println("Origin - $originStudent")
}