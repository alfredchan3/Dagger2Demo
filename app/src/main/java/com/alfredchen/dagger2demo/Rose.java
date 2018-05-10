package com.alfredchen.dagger2demo;

import javax.inject.Inject;

public class Rose {

    @Inject
    public Rose(){}

    public String whisper()  {
        return "hello";
    }
}