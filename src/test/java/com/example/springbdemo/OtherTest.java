package com.example.springbdemo;


import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OtherTest {

    @Test
    void exampleOne() {
        assertThat(1 + 1, is(3));
    }
}
