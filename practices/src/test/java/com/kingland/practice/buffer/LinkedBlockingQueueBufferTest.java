package com.kingland.practice.buffer;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedBlockingQueueBufferTest {

    private static LinkedBlockingQueueBuffer buffer;

    @BeforeEach
    public void setup() {
        buffer = new LinkedBlockingQueueBuffer(5);
    }

    @Nested
    @DisplayName("shouldAddElementToBuffer")
    class ShouldAddElementToBuffer {
        @Test
        @DisplayName("correctly")
        void shouldAddElementToBufferCorrectly() {
            // given
            String element = "hello";

            // when
            buffer.add(element);

            // then
            assertEquals(1, buffer.size(), "expected size is 1 but " + buffer.size());
        }

        @Test
        @Disabled
        @DisplayName("failed")
        void shouldAddElementToBufferFailed() {
            // given
            String element = "hello";
            buffer.add(element);
            buffer.add(element);
            buffer.add(element);
            buffer.add(element);
            buffer.add(element);

            // when
            buffer.add(element);

            // then
            assertEquals(5, buffer.size(), "expected size is 5 but " + buffer.size());
        }
    }


    @Nested
    @DisplayName("shouldPollElementFromBuffer")
    class ShouldPollElementFromBuffer {
        @Test
        @DisplayName("correctly")
        void shouldPollElementFromBufferCorrectly() {
            // given
            buffer.add("hello");
            buffer.add("hello");

            // when
            buffer.poll();

            // then
            assertEquals(1, buffer.size(), "expected size is 1 but " + buffer.size());
        }

        @Test
        @Disabled
        @DisplayName("failed")
        void shouldPollElementFromBufferFailed() {
            buffer.poll();

            assertEquals(0, buffer.size(), "expected size is 0 but " + buffer.size());
        }
    }

    @Test
    @DisplayName("shouldGetSizeOfBuffer")
    void shouldGetSizeOfBuffer() {

        buffer.size();

        assertEquals(0, buffer.size(), "expected size is 1 but " + buffer.size());
    }
}
