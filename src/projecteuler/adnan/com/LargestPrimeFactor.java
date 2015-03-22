package projecteuler.adnan.com;

public class LargestPrimeFactor {
	
	long number;
	
	public LargestPrimeFactor(long number) {
		this.number = number;
	}
	
	public long calculate() {
		long prime=1;
		for(long candidate=2; number>1; candidate++) {
			for(; number%candidate==0; number/=candidate) {
				prime=candidate;
				System.out.println(prime);
			}
		}
		return prime;
	}
	

}
