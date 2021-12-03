package com.example.helloworld

fun main(){
    println("hello kotlin")
//    val关键字用来声明一个不可变的变量
    var a = ""
//    val关键字用来声明一个不可变的变量
    a = 10.toString()
    println(a)
    test("asd")
    val p = Person()
    p.name = "jack"
    p.age = 12
    p.eat()
}

fun test(str:String):String{
    println("$str 输出结果")
    return  str
}
