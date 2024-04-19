package com.anehta.athenakotlinlab;

import androidx.annotation.NonNull;

public class ButtonTest implements ViewComponent {
    @NonNull
    @Override
    public State getCurrentState() {
        return new ButtonState();
    }

    @Override
    public void restoreState(@NonNull State state) {
        ViewComponent.super.restoreState(state);
    }

    static public class ButtonState implements State { /**/
    }
}