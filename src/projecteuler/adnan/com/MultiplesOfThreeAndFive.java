package projecteuler.adnan.com;

public class MultiplesOfThreeAndFive {
	
	public int calculate() {
		int result=0;
		for(int i=0; i<1000; i++) {
			if((i%3 == 0) || (i%5 == 0))
				result += i;
		}
		return result;
	}
}
