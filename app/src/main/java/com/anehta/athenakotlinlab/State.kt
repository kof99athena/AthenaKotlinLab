package com.anehta.athenakotlinlab

import java.io.Serializable

interface State : Serializable //Serializable을 구현한다.

interface ViewComponent {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}