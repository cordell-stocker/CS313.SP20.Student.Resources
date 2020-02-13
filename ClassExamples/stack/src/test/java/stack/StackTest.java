package stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public StackTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        s1 = new AStack<>(3);
        s2 = new LStack<>();
    }

    @After
    public void tearDown() {
    }
    
    @Test
    public void testAStackPush() {
        assertEquals("< >", s1.toString());
        s1.push(33);
        assertEquals("< 33 >", s1.toString());
    }
    
    @Test
    public void testAStackPop() {
        s1.push(22);
        Integer val = s1.pop();
        assertEquals(val.intValue(), 22);
        assertEquals("< >", s1.toString());
    }
    
    @Test
    public void testAStack() {
        s1.push(10);
        s1.push(20);
        s1.push(15);
        assertEquals("< 15 20 10 >", s1.toString());
        while (s1.length() > 0) {
            s2.push(s1.pop());
        }
        assertEquals("< >", s1.toString());
        assertEquals("< 10 20 15 >", s2.toString());
    }

    @Test
    public void testLStack() {
        s2.push(10);
        s2.push(20);
        s2.push(15);
        assertEquals("< 15 20 10 >", s2.toString());
        while (s2.length() > 0) {
            s1.push(s2.pop());
        }
        assertEquals("< >", s2.toString());
        assertEquals("< 10 20 15 >", s1.toString());
    }
}
