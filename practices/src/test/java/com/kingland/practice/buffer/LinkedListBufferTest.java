package com.kingland.practice.buffer;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBufferTest {

    private static LinkedListBuffer buffer;

    @BeforeAll
    public static void setup() {
        buffer = new LinkedListBuffer(5);
    }

    @Test
    void test() {
        buffer.add("hello");
        assertEquals(1, buffer.size(), "expected size is 1 but " + buffer.size());
        buffer.poll();
        assertEquals(0, buffer.size(), "expected size is 0 but " + buffer.size());
    }
}
