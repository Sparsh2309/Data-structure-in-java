
public class Queue {
     int queue[]= new int[5];
     int size;
     int front;
     int rear;
     public void enQueue(int data){
    	 queue [rear]= data;
    	 rear++;
    	 size++;
     }
     public int deQueue() {
    	 int data= queue[front];
    	 front++;
    	 size--;
    	 return data;
     }
     public boolean compare() {
    	 if (rear==front) {
    		 System.out.println("Your turn next");
    		 return true;
    	 }
    	 else {
    		 System.out.println("Wait for your turn");
    		 return false;
    	 }
     }
}
