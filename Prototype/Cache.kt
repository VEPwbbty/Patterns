package Prototype

class Cache(student: Student) {
    /**
     * Clone condition of the student at the moment of the call
     */
    val clone = student
        get() = field.clone()

    /**
     * Clone condition of the student at the moment of creation this object
     */
    val originClone = student.clone()
        get() = field.clone()
}