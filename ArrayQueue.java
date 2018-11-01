package Queue;

import java.util.Iterator;

public class ArrayQueue<T> implements QueueInterface<T> {
	private T[] queue;
	private int n = 0;
	private int top = 0;
	private int count = 0;
	private int default_size = 100;
	
	public ArrayQueue(int capacity) {
		n = capacity;
		queue = (T[]) new Object[capacity];
	}
	
	public ArrayQueue() {
		n = default_size;
		queue = (T[]) new Object[default_size];
	}

	@Override
	public void enqueue(T element) {
		// TODO Auto-generated method stub
		if (count < n) {
			queue[(top + count) % n] = element;
			count++;
		}
		
	}

	@Override
	public T dequeue() {
		// TODO Auto-generated method stub
		if (count > 0) {
			T element = queue[top];
			count--;
			top++;
			if (top == n) {
				top = 0;
			}
			return element;
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return count == 0;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ArrayQueueIterator();
	}
	
	class ArrayQueueIterator implements Iterator<T>{
		private int current = top;
		private int num = 0;
		
		@Override
		public boolean hasNext() {
			return num < count;
		}
		
		@Override
		public T next() {
			T data = queue[(current + num) % n];
			num++;
			return data;
		}
	}
	
	
}
