package edu.vuum.mocca;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @class SimpleAtomicLongUnitTest
 *
 * @brief Simple unit test for the SimpleAtomicLong clas that ensures
 *        the version submitted for this assignment works correctly.
 */
public class SimpleAtomicLongUnitTest {
    @Test
    public void testSimpleAtomicLong() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertNotNull(testLong);
    }

    @Test
    public void testGet() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertEquals(testLong.get(), 0l);

        SimpleAtomicLong testLong2 = new SimpleAtomicLong(100);
        assertEquals(testLong2.get(), 100l);

        SimpleAtomicLong testLong3 = new SimpleAtomicLong(-100);
        assertEquals(testLong3.get(), -100l);
    }

    @Test
    public void testDecrementAndGet() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertEquals(testLong.decrementAndGet(), -1l);
        assertEquals(testLong.get(), -1l);

        SimpleAtomicLong testLong2 = new SimpleAtomicLong(100);
        assertEquals(testLong2.decrementAndGet(), 99l);
        assertEquals(testLong2.get(), 99l);

        SimpleAtomicLong testLong3 = new SimpleAtomicLong(-100);
        assertEquals(testLong3.decrementAndGet(), -101l);
        assertEquals(testLong3.get(), -101l);
    }

    @Test
    public void testIncrementAndGet() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertEquals(testLong.incrementAndGet(), 1l);
        assertEquals(testLong.get(), 1l);

        SimpleAtomicLong testLong2 = new SimpleAtomicLong(100);
        assertEquals(testLong2.incrementAndGet(), 101l);
        assertEquals(testLong2.get(), 101l);

        SimpleAtomicLong testLong3 = new SimpleAtomicLong(-100);
        assertEquals(testLong3.incrementAndGet(), -99l);
        assertEquals(testLong3.get(), -99l);
    }

    @Test
    public void testGetAndIncrement() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertEquals(testLong.getAndIncrement(), 0l);
        assertEquals(testLong.get(), 1l);

        SimpleAtomicLong testLong2 = new SimpleAtomicLong(100);
        assertEquals(testLong2.getAndIncrement(), 100l);
        assertEquals(testLong2.get(), 101l);

        SimpleAtomicLong testLong3 = new SimpleAtomicLong(-100);
        assertEquals(testLong3.getAndIncrement(), -100l);
        assertEquals(testLong3.get(), -99l);
    }

    @Test
    public void testGetAndDecrement() {
        SimpleAtomicLong testLong = new SimpleAtomicLong(0);
        assertEquals(testLong.getAndDecrement(), 0l);
        assertEquals(testLong.get(), -1l);

        SimpleAtomicLong testLong2 = new SimpleAtomicLong(100);
        assertEquals(testLong2.getAndDecrement(), 100l);
        assertEquals(testLong2.get(), 99l);

        SimpleAtomicLong testLong3 = new SimpleAtomicLong(-100);
        assertEquals(testLong3.getAndDecrement(), -100l);
        assertEquals(testLong3.get(), -101l);
    }

}
