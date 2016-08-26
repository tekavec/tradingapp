package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppShould {

    @Test
    public void show_helloworld_message() {
        assertThat(new App().sayHello(), is("hello!"));
    }
}
