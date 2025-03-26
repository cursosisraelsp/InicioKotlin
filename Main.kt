package org.example

import org.example.com.funcions.NonDevolveNada
import org.example.com.funcions.someOtherFunction
import org.example.com.funcions.suma


fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun suma2(x: Int, y: Int) = x + y
fun resta(x: Int, y: Int) = x - y
fun main() {
    println("Hello World!")
    //someOtherFunction{NonDevolveNada()}
    someOtherFunction{ v1 , v2 -> suma(v1,v2)}
    println(operar(10, 5, ::suma2)) // 15
    println(operar(10, 5, ::resta)) // 5

    println(OMeuNome())
}