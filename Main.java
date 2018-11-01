package Queue;

public class Main {
	public static void main(String[] args) {
		ArrayQueue<Integer> temp = new ArrayQueue<>();
		temp.enqueue(3);
		temp.enqueue(2);
		
		for (Integer integer : temp) {
			System.out.println(integer);
		}
		System.out.println(temp.isEmpty());
	}

}
