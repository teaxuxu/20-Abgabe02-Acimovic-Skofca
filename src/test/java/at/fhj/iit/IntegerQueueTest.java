package at.fhj.iit;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class IntegerQueueTest {

    /**
     * JAVADOC
     */
    @Test
    void testCanAddAndPollQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(17);
        assertEquals(17, queue.peek());
        assertEquals(17, queue.poll());
    }

    @Test
    void testCanRejectToManyElements() {
        IQueue<Integer> queue = new GenericQueue<Integer>(2);
        assertTrue(queue.offer(1));
        assertTrue(queue.offer(2));
        assertFalse(queue.offer(3));
    }


    @Test
    void testCanPollQueueWithTwoElements() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.poll());
        assertEquals(2, queue.poll());
    }


    @Test
    void testCanPollEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        assertNull(queue.poll());
    }

    @Test
    void testCanPeekEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        assertNull(queue.peek());
    }

    @Test
    void testCanGetElementFromSingleQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        assertEquals(1, queue.element());
        assertEquals(1, queue.element());
    }
    @Test
    void testFailsToGetElementFromEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);

        assertThrows(NoSuchElementException.class, queue::element);
    }

    @Test
    void testCanGetElementFromDoubleQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);
        queue.offer(1);
        queue.offer(2);
        assertEquals(1, queue.element());
        assertEquals(1, queue.element());
    }

    @Test
    void testFailsToRemoveElementFromEmptyQueue() {
        IQueue<Integer> queue = new GenericQueue<Integer>(10);

        assertThrows(NoSuchElementException.class, queue::remove);
    }
}