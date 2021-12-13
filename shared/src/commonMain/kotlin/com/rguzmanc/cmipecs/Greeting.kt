package com.rguzmanc.cmipecs

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}