package com.example.l7_homework

class OAK : Plants (){
    override fun grow(str : String): String {
        val result = str + " is growing"
        return super.grow(result)
    }



}