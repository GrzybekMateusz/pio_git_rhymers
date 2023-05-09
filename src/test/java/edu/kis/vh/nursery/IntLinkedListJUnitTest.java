package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList intLinkedList = new IntLinkedList();

        for(int i = 0; i < 50; ++i) {
            intLinkedList.push(i);
            Assert.assertEquals(i, intLinkedList.top());
        }
    }

    @Test
    public void testPop() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(-1, intLinkedList.pop());

        for(int i = 0; i < 50; ++i) {
            intLinkedList.push(i);
        }

        for(int i = 49; i >= 0; --i) {
            Assert.assertEquals(i, intLinkedList.pop());
        }

        Assert.assertEquals(-1, intLinkedList.pop());
    }

    @Test
    public void testTop() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertEquals(-1, intLinkedList.top());

        for(int i = 0; i < 50; ++i) {
            intLinkedList.push(i);
            Assert.assertEquals(i, intLinkedList.top());
        }

        for(int i = 49; i >= 0; --i) {
            Assert.assertEquals(i, intLinkedList.top());
            intLinkedList.pop();
        }

        Assert.assertEquals(-1, intLinkedList.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertTrue(intLinkedList.isEmpty());

        for(int i = 0; i < 50; ++i) {
            intLinkedList.push(i);
            Assert.assertFalse(intLinkedList.isEmpty());
        }

        for (int i = 0; i < 50; ++i) {
            Assert.assertFalse(intLinkedList.isEmpty());
            intLinkedList.pop();
        }

        Assert.assertTrue(intLinkedList.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList intLinkedList = new IntLinkedList();

        Assert.assertFalse(intLinkedList.isFull());

        for(int i = 0; i < 10 ; ++i) {
            intLinkedList.push(i);
            Assert.assertFalse(intLinkedList.isFull());
        }

        for(int i = 0; i < 10 ; ++i) {
            Assert.assertFalse(intLinkedList.isFull());
            intLinkedList.pop();
        }

        Assert.assertFalse(intLinkedList.isFull());
    }

}
