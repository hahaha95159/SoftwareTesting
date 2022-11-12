import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class QueueTest extends TestCase {

	@Test
	public void testQueueClass0() {

		try {
			//Test Case for Path1: 
			Queue q1 = new Queue(1); 
			assertEquals("[]", q1.toString());
			q1.insert(23477);
			assertEquals("[23477]", q1.toString());
			q1.delete();
			assertEquals("[]", q1.toString());
			q1.insert(17658);
			assertEquals("[17658]", q1.toString());
			q1.delete();
			assertEquals("[]", q1.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}		
	
	@Test
	public void testQueueClass1() {

		try {
			//Test Case for Path1: 
			Queue q1 = new Queue(2); 
			assertEquals("[]", q1.toString());
			q1.insert(23477);
			assertEquals("[23477]", q1.toString());
			q1.delete();
			assertEquals("[]", q1.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass2() {
		
		try {
			//Test Case for Path2:
			Queue q2 = new Queue(2); 
			assertEquals("[]", q2.toString());
			q2.insert(23477);
			assertEquals("[23477]", q2.toString());
			q2.delete();
			assertEquals("[]", q2.toString());
			q2.insert(17658);
			assertEquals("[17658]", q2.toString());
			q2.delete();
			assertEquals("[]", q2.toString());
		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass3() {
		
		try {
			//Test Case for Path3: 
			Queue q3 = new Queue(2); 
			assertEquals("[]", q3.toString());
			q3.insert(23477);
			assertEquals("[23477]", q3.toString());
			q3.insert(17658);
			assertEquals("[23477, 17658]", q3.toString());
			q3.delete();
			assertEquals("[17658]", q3.toString());
			q3.delete();
			assertEquals("[]", q3.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass4() {

		try {
			//Test Case for Path4: 
			Queue q4 = new Queue(3); 
			assertEquals("[]", q4.toString());
			q4.insert(23477);
			assertEquals("[23477]", q4.toString());
			q4.insert(17658);
			assertEquals("[23477, 17658]", q4.toString());
			q4.insert(26754);
			assertEquals("[23477, 17658, 26754]", q4.toString());
			q4.delete();
			assertEquals("[17658, 26754]", q4.toString());
			q4.delete();
			assertEquals("[26754]", q4.toString());
			q4.delete();
			assertEquals("[]", q4.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass5() {

		try {
			//Test Case for Path5: 
			Queue q5 = new Queue(4); 
			assertEquals("[]", q5.toString());
			q5.insert(23477);
			assertEquals("[23477]", q5.toString());
			q5.insert(17658);
			assertEquals("[23477, 17658]", q5.toString());
			q5.insert(26754);
			assertEquals("[23477, 17658, 26754]", q5.toString());
			q5.delete();
			assertEquals("[17658, 26754]", q5.toString());
			q5.delete();
			assertEquals("[26754]", q5.toString());
			q5.delete();
			assertEquals("[]", q5.toString());
		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass6() {

		try {
			//Test Case for Path6: 
			Queue q6 = new Queue(2); 
			assertEquals("[]", q6.toString());
			q6.insert(23477);
			assertEquals("[23477]", q6.toString());
			q6.insert(17658);
			assertEquals("[23477, 17658]", q6.toString());
			q6.delete();
			assertEquals("[17658]", q6.toString());
			q6.insert(24416);
			assertEquals("[17658, 24416]", q6.toString());
			q6.delete();
			assertEquals("[24416]", q6.toString());
			q6.delete();
			assertEquals("[]", q6.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}
	@Test
	public void testQueueClass7() {

		try {
			//Test Case for Path7: 
			Queue q7 = new Queue(3); 
			assertEquals("[]", q7.toString());
			q7.insert(23477);
			assertEquals("[23477]", q7.toString());
			q7.insert(17658);
			assertEquals("[23477, 17658]", q7.toString());
			q7.delete();
			assertEquals("[17658]", q7.toString());
			q7.insert(24416);
			assertEquals("[17658, 24416]", q7.toString());
			q7.delete();
			assertEquals("[24416]", q7.toString());
			q7.delete();
			assertEquals("[]", q7.toString());

		}catch(Exception e){
			assertTrue(false);
		}
	}
}
