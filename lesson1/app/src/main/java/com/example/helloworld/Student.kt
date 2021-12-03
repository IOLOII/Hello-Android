package com.example.helloworld

class Student(val sno: String, val grade: Int=1): Person() {
//    var sno = ""
//    var grade = 0
    init {
        println("sno is $sno")
        println("grade is $grade")
    }
}

fun main() {
    var st1 = Student("001")
    println(st1.sno)
}
