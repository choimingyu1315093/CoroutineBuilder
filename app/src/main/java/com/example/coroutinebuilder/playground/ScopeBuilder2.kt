package com.example.scopebuilder.playground

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//코루틴은 겹처서 사용할 수 있다.
//상위 코루틴은 하위 코루틴이 끝나기 전에 종료되지 않는다. 단, 상위 코루틴을 종료시키면 하위 코루틴도 같이 종료된다.
fun main() {
    runBlocking {
        launch {
            doThree()
        }
        launch {
            doOne()
        }
        doTwo()
    }
    println("4")
}

suspend fun doThree(){
    println("launch1")
    delay(1000L)
    println("3")
}

suspend fun doOne(){
    println("launch1")
    println("1")
}

suspend fun doTwo(){
    println("runBlocking")
    delay(500L)
    println("2")
}