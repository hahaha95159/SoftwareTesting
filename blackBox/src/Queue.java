import java.util.*;
import java.util.LinkedList;


public class Queue {
	private int bound;
	private LinkedList<Integer> queue = new LinkedList<Integer>();
	//LinkedList queue = new LinkedList();
	
	public Queue(int b) throws IllegalBoundException {
		if(b >= 0) {
			this.bound = b;
		}else {
			throw new IllegalBoundException();
		}
	}
	
	public int getBound() {
		return bound;
	}
	
	public void insert(int x) throws QueueFullException {
		if(queue.size() < bound ) {
			queue.offer(x);
		}else {
			throw new QueueFullException();
		}
	}
	
	public void delete() throws QueueEmptyException {
		if(queue.size() > 0 ) {
			queue.poll();
		}else {
			throw new QueueEmptyException();
		}
	}
	
	public int first() throws QueueEmptyException {
		if(queue.size() > 0 ) {
			return queue.getFirst();
		}else {
			throw new QueueEmptyException();
		}
	}
	
	public int last() throws QueueEmptyException {
		if(queue.size() > 0 ) {
			return queue.getLast();
		}else {
			throw new QueueEmptyException();
		}
	}
	
	public boolean isEmpty() {
		if(queue.size() == 0 ) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(queue.size() == bound ) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String QueueRecord = "[";
		if(queue.size() > 0) {
			for(int i=0; i < queue.size(); i++) {
				QueueRecord = QueueRecord + queue.get(i) + ", ";
			}
			QueueRecord = QueueRecord.substring(0, QueueRecord.length()-2) + "]";
		}else {
			QueueRecord = QueueRecord + "]";
		}
		return QueueRecord;
	}
}
