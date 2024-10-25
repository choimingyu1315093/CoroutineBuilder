package com.example.scopebuilder.playground

import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//코루틴의 시작은 코루틴 스코프다
//코루틴 스코프는 코루틴을 제대로 처리하기 위한 정보인 코루틴 콘텍스트를 가지고 있다.
//코루틴을 만드는 함수를 코루틴 빌더라고 한다.
//1.runBlocking은 다른거 작업 못하게 막는다.
//2.launch는 코루틴 내에서 사용하고, 할 수 있다면 다른 코루틴 코드를 같이 수행 시키는 코루틴 빌더.
fun main() = runBlocking {
    launch {
        println("launch")
        println("World")
    }
    println("runBlocking")
    delay(2000L)
    println("Hello")
}
//runBlocking 코루틴 빌더는 다른 작업 못하게 막기 때문에 runBlocking이랑 Hello 먼저 출력되고, launch랑 World 출력되는데
//지금 delay가 있어서 runBlocking 출력되고, launch, World, Hello 순으로 출력된다.
//delay와 Thread.sleep의 차이는 delay는 쉬는 동안에 양보하는데 sleep는 양보 안한다.
