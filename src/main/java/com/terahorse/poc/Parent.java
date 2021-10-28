package com.terahorse.poc;

import org.springframework.stereotype.Component;

@Component
public class Parent {

    public final Child child;

    public Parent(Child child) {
        this.child = child;
    }

    public Child getChild() {
        return child;
    }

}
