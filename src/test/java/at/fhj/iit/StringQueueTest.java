package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class StringQueueTest {

    @Test
    void testCanAddAndPollQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        assertEquals("hello", queue.peek());
        assertEquals("hello", queue.poll());
    }

    @Test
    void testCanRejectToManyElements() {
        IQueue queue = new StringQueue(2);
        assertEquals(true, queue.offer("1"));
        assertEquals(true, queue.offer("2"));
        assertEquals(false, queue.offer("3"));
    }


    @Test
    void testCanPollQueueWithTwoElements() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        queue.offer("world");
        assertEquals("hello", queue.poll());
        assertEquals("world", queue.poll());
    }


    @Test
    void testCanPollEmptyQueue() {
        IQueue queue = new StringQueue(10);
        assertEquals(null, queue.poll());
    }

    @Test
    void testCanPeekEmptyQueue() {
        IQueue queue = new StringQueue(10);
        assertEquals(null, queue.peek());
    }

    @Test
    void testCanGetElementFromSingleQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        assertEquals("hello", queue.element());
        assertEquals("hello", queue.element());
    }
    @Test
    void testFailsToGetElementFromEmptyQueue() {
        IQueue queue = new StringQueue(10);

        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }

    @Test
    void testCanGetElementFromDoubleQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        queue.offer("world");
        assertEquals("hello", queue.element());
        assertEquals("hello", queue.element());
    }

    @Test
    void testFailsToRemoveElementFromEmptyQueue() {
        IQueue queue = new StringQueue(10);

        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }
}