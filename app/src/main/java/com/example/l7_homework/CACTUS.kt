package com.example.l7_homework

class CACTUS : Plants() {
    override fun grow(str: String): String {
        val result = str + " is growing"
        return super.grow(result)
    }
}