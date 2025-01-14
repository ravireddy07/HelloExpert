import java.util.*; 

class linkedBag {
	int []bags = new int[10];
	
	linkedBag(int ar[]) {
		for(int i=0;i<10;i++) {
			this.bags[i] = ar[i];
		}
	}
	
	int getMin() {
		int temp = bags[0];
		for(int i=1;i<10;i++) {
			if(bags[i] < temp) {
				temp = bags[i];
			}
		}
		return temp;
	}
	
	int getMax() {
		int temp = bags[0];
		for(int i=1;i<10;i++) {
			if(bags[i] > temp) {
				temp = bags[i];
			}
		}
		return temp;
	}
}


public class Solution { 
	public static void main(String[] argv) {
		int ar[] = {10, 83, 23, 28, 64, 73, 37, 54, 62, 49};
		linkedBag a = new linkedBag(ar);
		int min = a.getMin();
		int max = a.getMax();
		
		System.out.println("Minimum value is: " + min);
		System.out.println("Maximum value is: " + max);
	} 
} 
