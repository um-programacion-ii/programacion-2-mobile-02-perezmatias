package com.dqmdz.programacion2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform