package nandosan.tekno.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("Test Queue")
public class TestQueue {

    private Queue<String> queue;

    @Nested
    @DisplayName("When New")
    public class WhenNew{

        @BeforeEach
        void setUp(){
            queue = new LinkedList<>();
        }

        @DisplayName("when offer, size must be 1")
        @Test
        void offerNewData(){
            queue.offer("Nandosan");
            Assertions.assertEquals(1,queue.size());
        }

        @DisplayName("when offer more data , sise must be 2")
        @Test
        void offerMoreData(){
            queue.offer("Nandosan");
            queue.offer("Martinsan");
            Assertions.assertEquals(2,queue.size());
        }
    }
}
