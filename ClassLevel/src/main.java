
public class main {
	public static void main(String args[]) throws IllegalBoundException, QueueFullException, QueueEmptyException {
		Queue q = new Queue(3);
		
		System.out.println(q.getBound());
		q.insert(234);
		q.insert(533);
		q.insert(21);
		q.insert(222);
		//q.delete();
		System.out.println(q.toString());
		System.out.println(q.first());
		//System.out.println(q.last());
		//System.out.println(q.isEmpty());
		//System.out.println(q.isFull());
	}
}
