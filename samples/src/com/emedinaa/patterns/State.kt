package com.emedinaa.patterns

/**
 * Created by eduardomedina on 31/10/16.
 */

interface State{

    fun startPlay()
    fun stopPlay()
}

class PlayState:State{
    override fun startPlay() {
        println("You're already playing...")
    }

    override fun stopPlay() {
        println("Go to the stop state.")
    }

}

class StopState:State{
    override fun startPlay() {
        println("Go to the Play state.")
    }

    override fun stopPlay() {
        println("You're already stopped")
    }
}

class VideoContext():State{

    lateinit var playState:State
    lateinit var stopState:State
    lateinit var state:State

    init {
        println("Video is On")
        playState= PlayState()
        stopState= StopState()
        state= stopState
    }
    override fun startPlay() {
        state.startPlay()
    }

    override fun stopPlay() {
        state.stopPlay()
    }

}