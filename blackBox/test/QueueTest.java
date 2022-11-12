import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	public void testQueue0() {
		try {
			Queue q = new Queue(-1);
			assertFalse(true);
		}catch(IllegalBoundException e){
			assertFalse(false);
		}
	}

	public void testQueue1() {
		try {
			Queue q = new Queue(0);
			assertEquals("[]", q.toString());
			assertTrue(true);
		}catch(Exception e){
			assertTrue(false);
		}
	}
	
	@Test
	public void testInsert0() {
		//bound = 0
		try {
			Queue q = new Queue(0);
			q.insert(8313);
			assertFalse(true);
		}catch(QueueFullException e) {
			assertFalse(false);
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testInsert1() {	
		//bound = 1
		try {
			Queue q = new Queue(1);
			q.insert(27443);
			assertEquals("[27443]", q.toString());
			assertTrue(true);
		}catch(QueueFullException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}
		
	}

	public void testInsert2() {
		try {
			Queue q = new Queue(1);
			q.insert(32567);
			q.insert(5326);
			assertFalse(true);
		}catch(QueueFullException e) {
			assertFalse(false);;
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testInsert3() {
		//bound = 4
		try {
			Queue q = new Queue(4);
			q.insert(723);
			assertEquals("[723]", q.toString());
			assertTrue(true);
		}catch(QueueFullException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}
	}

	public void testInsert4() {
		try {
			Queue q = new Queue(4);
			q.insert(23556);
			q.insert(1763);
			assertEquals("[23556, 1763]", q.toString());
			assertTrue(true);
		}catch(QueueFullException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}
	}

	public void testInsert5() {
		try {
			Queue q = new Queue(4);
			q.insert(16773);
			q.insert(9872);
			q.insert(7234);
			assertEquals("[16773, 9872, 7234]", q.toString());
			assertTrue(true);
		}catch(QueueFullException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}
	}

	public void testInsert6() {
		try {
			Queue q = new Queue(4);
			q.insert(44881);
			q.insert(23745);
			q.insert(22348);
			q.insert(7007);
			assertEquals("[44881, 23745, 22348, 7007]", q.toString());	
			assertTrue(true);
		}catch(QueueFullException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}
	}

	public void testInsert7() {
		try {
			Queue q = new Queue(4);
			q.insert(30451);
			q.insert(2987);
			q.insert(40044);
			q.insert(3123);
			q.insert(723);	
			assertFalse(true);
		}catch(QueueFullException e) {
			assertFalse(false);;
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
	}
	@Test
	public void testDelete0() {
		//bound = 0
		try {
			Queue q = new Queue(0);
			q.delete();
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
		
	}

	public void testDelete1() {
		//bound = 1
		try {
			Queue q = new Queue(1);
			q.delete();
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testDelete2() {
		try {
			Queue q = new Queue(1);
			q.insert(30117);
			q.delete();
			assertEquals("[]", q.toString());		
			assertTrue(true);
		}catch(QueueEmptyException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}catch(QueueFullException e) {
			assertTrue(false);
		}
	}

	public void testDelete3() {
		//bound = 4
		try {
			Queue q = new Queue(4);
			q.delete();
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		}catch(IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testDelete4() {
		try {
			Queue q = new Queue(4);
			q.insert(30117);
			q.delete();
			assertEquals("[]", q.toString());						
			assertTrue(true);
		}catch(QueueEmptyException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}catch(QueueFullException e) {
			assertTrue(false);
		}
	}

	public void testDelete5() {
		try {
			Queue q = new Queue(4);
			q.insert(23083);
			q.insert(20114);
			q.delete();
			assertTrue(true);
			assertEquals("[20114]", q.toString());			
		}catch(QueueEmptyException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}catch(QueueFullException e) {
			assertTrue(false);
		}
	}

	public void testDelete6() {
		try {
			Queue q = new Queue(4);
			q.insert(26871);
			q.insert(31362);
			q.insert(22839);
			q.delete();
			assertTrue(true);
			assertEquals("[31362, 22839]", q.toString());
		}catch(QueueEmptyException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}catch(QueueFullException e) {
			assertTrue(false);
		}
	}

	public void testDelete7() {
		try {
			Queue q = new Queue(4);
			q.insert(6032);
			q.insert(355);
			q.insert(10434);
			q.insert(14584);
			q.delete();
			assertEquals("[355, 10434, 14584]", q.toString());
			assertTrue(true);
		}catch(QueueEmptyException e) {
			assertTrue(false);
		}catch(IllegalBoundException e) {
			assertTrue(false);
		}catch(QueueFullException e) {
			assertTrue(false);
		}
	}

	@Test
	public void testFirst0() {
			//bound = 0
		try {
			Queue q1 = new Queue(0);
			assertEquals(0, q1.first());
			assertEquals("[]", q1.toString());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
			
	}

	public void testFirst1() {
		//bound = 1
		try {
			Queue q1 = new Queue(1);
			assertEquals(0, q1.first());
			assertEquals("[]", q1.toString());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testFirst2() {
		try {
			Queue q = new Queue(1);
			q.insert(8642);
			assertEquals(8642, q.first());
			assertEquals("[8642]", q.toString());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testFirst3() {
		//bound = 4
		try {
			Queue q1 = new Queue(4);
			assertEquals(0, q1.first());
			assertEquals("[]", q1.toString());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testFirst4() {
		try {
			Queue q = new Queue(4);
			q.insert(8642);
			assertEquals(8642, q.first());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testFirst5() {
		try {
			Queue q = new Queue(4);
			q.insert(5023);
			q.insert(1496);
			assertEquals(5023, q.first());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testFirst6() {
		try {
			Queue q = new Queue(4);
			q.insert(1624);
			q.insert(29227);
			q.insert(2508);
			assertEquals(1624, q.first());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testFirst7() {
		try {
			Queue q = new Queue(4);
			q.insert(16812);
			q.insert(10251);
			q.insert(8412);
			q.insert(6412);
			assertEquals(16812, q.first());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	@Test
	public void testLast0() {
	//bound = 0
		try {
			Queue q = new Queue(0);
			assertEquals(0, q.last());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
	}
	public void testLast1() {
		//bound = 1
		try {
			Queue q = new Queue(1);
			assertEquals(0, q.last());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testLast2() {
		try {
			Queue q = new Queue(1);
			q.insert(31554);
			assertEquals(31554, q.last());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testLast3() {
		//bound = 4
		try {
			Queue q = new Queue(4);
			assertEquals(0, q.last());
			assertFalse(true);
		}catch(QueueEmptyException e) {
			assertFalse(false);
		} catch (IllegalBoundException e) {
			assertFalse(true);
		}
	}

	public void testLast4() {
		try {
			Queue q = new Queue(4);
			q.insert(31554);
			assertEquals(31554, q.last());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testLast5() {
		try {
			Queue q = new Queue(4);
			q.insert(29768);
			q.insert(18651);
			assertEquals(18651, q.last());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testLast6() {
		try {
			Queue q = new Queue(4);
			q.insert(15240);
			q.insert(2105);
			q.insert(21296);
			assertEquals(21296, q.last());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testLast7() {
		try {
			Queue q = new Queue(4);
			q.insert(6245);
			q.insert(22349);
			q.insert(3954);
			q.insert(17588);
			assertEquals(17588, q.last());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void testIsEmpty0() {
		//bound = 0
		try {
			Queue q1 = new Queue(0);
			assertEquals(true, q1.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty1() {
		//bound = 1
		try {
			Queue q1 = new Queue(1);
			assertEquals(true, q1.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty2() {
		try {
			Queue q = new Queue(1);
			q.insert(31799);
			assertEquals(false, q.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty3() {
		//bound = 4
		try {
			Queue q1 = new Queue(4);
			assertEquals(true, q1.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty4() {
		try {
			Queue q = new Queue(4);
			q.insert(31799);
			assertEquals(false, q.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty5() {
		try {
			Queue q = new Queue(4);
			q.insert(3488);
			q.insert(16601);
			assertEquals(false, q.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty6() {
		try {
			Queue q = new Queue(4);
			q.insert(29751);
			q.insert(22107);
			q.insert(503);
			assertEquals(false, q.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsEmpty7() {
		try {
			Queue q = new Queue(4);
			q.insert(30535);
			q.insert(3065);
			q.insert(2271);
			q.insert(17056);
			assertEquals(false, q.isEmpty());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void testIsFull0() {
		//bound = 0
		try {
			Queue q1 = new Queue(0);
			assertEquals(true, q1.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull1() {
		//bound = 1
		try {
			Queue q1 = new Queue(1);
			assertEquals(false, q1.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull2() {
		try {
			Queue q = new Queue(1);
			q.insert(5268);
			assertEquals(true, q.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull3() {
		//bound = 4
		try {
			Queue q1 = new Queue(4);
			assertEquals(false, q1.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull4() {
		try {
			Queue q = new Queue(4);
			q.insert(31827);
			assertEquals(false, q.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull5() {
		try {
			Queue q = new Queue(4);
			q.insert(29913);
			q.insert(11530);
			assertEquals(false, q.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull6() {
		try {
			Queue q = new Queue(4);
			q.insert(767);
			q.insert(7329);
			q.insert(2597);
			assertEquals(false, q.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}

	public void testIsFull7() {
		try {
			Queue q = new Queue(4);
			q.insert(17641);
			q.insert(27209);
			q.insert(12110);
			q.insert(28189);
			assertEquals(true, q.isFull());
			assertTrue(true);
		}catch(Exception e) {
			assertTrue(false);
		}
	}
	@Test
	public void testToString() {
		try {
			Queue queue = new Queue(4);
			queue.insert(20862);
			queue.insert(14639);
			queue.insert(2823);
			queue.insert(25741);
			assertEquals("[20862, 14639, 2823, 25741]", queue.toString());
			assertTrue(true);
		}catch(Exception e){
			assertTrue(false);
		}
	}
			
}
