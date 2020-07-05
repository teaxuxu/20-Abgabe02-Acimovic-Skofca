package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class StringQueueTest {
    /**
     * tests if can add and poll queue
     */
    @Test
    void testCanAddAndPollQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        assertEquals("hello", queue.peek());
        assertEquals("hello", queue.poll());
    }
    /**
     * tests if can reject to many elements
     */
    @Test
    void testCanRejectToManyElements() {
        IQueue queue = new StringQueue(2);
        assertEquals(true, queue.offer("1"));
        assertEquals(true, queue.offer("2"));
        assertEquals(false, queue.offer("3"));
    }

    /**
     * tests if can poll queue with two elements
     */
    @Test
    void testCanPollQueueWithTwoElements() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        queue.offer("world");
        assertEquals("hello", queue.poll());
        assertEquals("world", queue.poll());
    }

    /**
     * tests if can poll empty queue
     */
    @Test
    void testCanPollEmptyQueue() {
        IQueue queue = new StringQueue(10);
        assertEquals(null, queue.poll());
    }

    /**
     * tests if can peek empty queue
     */
    @Test
    void testCanPeekEmptyQueue() {
        IQueue queue = new StringQueue(10);
        assertEquals(null, queue.peek());
    }

    /**
     * tests if can get element from single queue
     */
    @Test
    void testCanGetElementFromSingleQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        assertEquals("hello", queue.element());
        assertEquals("hello", queue.element());
    }
    /**
     * tests fails to get element from empty queue
     */
    @Test
    void testFailsToGetElementFromEmptyQueue() {
        IQueue queue = new StringQueue(10);

        assertThrows(NoSuchElementException.class, () -> {
            queue.element();
        });
    }

    /**
     * tests if can get element from double queue
     */
    @Test
    void testCanGetElementFromDoubleQueue() {
        IQueue queue = new StringQueue(10);
        queue.offer("hello");
        queue.offer("world");
        assertEquals("hello", queue.element());
        assertEquals("hello", queue.element());
    }

    /**
     * tests fails to remove element from empty queue
     */
    @Test
    void testFailsToRemoveElementFromEmptyQueue() {
        IQueue queue = new StringQueue(10);

        assertThrows(NoSuchElementException.class, () -> {
            queue.remove();
        });
    }
}