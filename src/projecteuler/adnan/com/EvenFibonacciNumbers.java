package projecteuler.adnan.com;

public class EvenFibonacciNumbers {
	
	public int calculate() {
		int previous=0, next=1, result=0, total=0;
		
		//do initial calculation 
		total = previous + next;
		previous = next;
		next = total;	
		
		do {
			total = previous + next;
			previous = next;
			next = total;				
			
			if(total%2==0) {
				result += total;
			}
		} while(result  <= 4000000);
		
		return result;
	}
}
