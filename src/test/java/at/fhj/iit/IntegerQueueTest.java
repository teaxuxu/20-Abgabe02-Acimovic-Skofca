package at.fhj.iit;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IntegerQueueTest {

    /**
     * tests if we can add an element and poll the queue
     */
    @Test
    void testCanAddAndPollQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(17);
        assertEquals(17, queue.peek());
        assertEquals(17, queue.poll());
    }

    /**
     * tests if it will reject to many elements
     */
    @Test
    void testCanRejectToManyElements() {
        IQueue<Integer> queue = new GenericQueue<Integer>(2);
        assertTrue(queue.offer(1));
        assertTrue(queue.offer(2));
        assertFalse(queue.offer(3));
    }

    /**
     * test if we can poll the queue with two elements
     */
    @Test
    void testCanPollQueueWithTwoElements() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
    }

    /**
     * test if empty poll can be polled
     */
    @Test
    void testCanPollEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        assertNull(queue.poll());
    }
    /**
     * test if empty queue can be peeked
     */
    @Test
    void testCanPeekEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        assertNull(queue.peek());
    }
    /**
     * tests if we can get element from single queue
     */
    @Test
    void testCanGetElementFromSingleQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        assertEquals(1, queue.element());
        assertEquals(1, queue.element());
    }

    /**
     * this test fails to get element from empty queue
     */
    @Test
    void testFailsToGetElementFromEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);

        assertThrows(NoSuchElementException.class, queue::element);
    }
    /**
     * test if we can get element from double queue
     */
    @Test
    void testCanGetElementFromDoubleQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.element());
        assertEquals(1, queue.element());
    }
    /**
     * this test fails to remove element from empty queue
     */
    @Test
    void testFailsToRemoveElementFromEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);

        assertThrows(NoSuchElementException.class, queue::remove);
    }
}