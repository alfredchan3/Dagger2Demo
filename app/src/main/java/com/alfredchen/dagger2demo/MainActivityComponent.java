package com.alfredchen.dagger2demo;

import dagger.Component;

@Component
public interface MainActivityComponent {
    void inject(MainActivity activity);
}