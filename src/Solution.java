
public class Solution {
	
	static long superNum(long k) {
		System.out.println(k);
		if (k == 0) {
			return 1;
		}
	    int d=countNum(k);
	    if(d == 1){
	        return k;
	    }
	    long s = sumNum(k);
	    return superNum(s);
	}

	static int countNum(long p) 
	{ 
	    int count = 0; 
	    while (p != 0) { 
	        p = p / 10; 
	        ++count; 
	    }
	    return count; 
	}

	static long sumNum(long p) 
	{ 
	    long sum = 0; 
	    while (p != 0) {
	        sum += p % 10; 
	        p = p / 10;  
	    } 
	    return sum; 
	}
	
	public static void main(String[] args) {
		System.out.println("Kirils Petrovs 171RDB098\n");

		System.out.println("Number 8753:");
		superNum(8753);
		System.out.println("Number 6:");
		superNum(6);
		System.out.println("Number 0:");
		superNum(0);
		System.out.println("Number 11:");
		superNum(11);
		System.out.println("Number 65:");
		superNum(65);
		System.out.println("Number 145:");
		superNum(145);
		System.out.println("Number 87:");
		superNum(87);
		System.out.println("Number 12:");
		superNum(12);
	}

}