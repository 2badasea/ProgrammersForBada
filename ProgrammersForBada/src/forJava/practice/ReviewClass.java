package forJava.practice;

public class ReviewClass {

	public static void main(String[] args) {
		// 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 갯수를 구한다. 숫자가 들어있는 배열 nums가 매개변수. 
		// 1. 반복문을 3번 돌릴 준비
		// 2. 루프를 돌면셔, 기존의 소수인 것만 찾아서 먼저 담아놓고 담아놓은 숫자들로만 비교하도록. 
		
		int[] nums = {1,2,3,4};
		int[] nums2 = {1,2,7,6,4};
		
		
//		System.out.println(countPrime(nums)); 
		System.out.println(countPrime(nums2)); 
		
	}
	
	static int countPrime(int[] nums) {
		int result =0;
		
		int cnt = 2;
		int[] primes = new int[nums.length + 1];
		primes[0] = 2;
		primes[1] = 3;
		
		int sum;
		for(int i = 0; i<nums.length -2; i++) {
			for(int j = i + 1; j<nums.length -1; j++) {
				for(int k = j + 1; k<nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if(primeCheck(sum, cnt, primes)) {
						primes[cnt++] = sum;
						result++;
					}
				}
			}
		}
		
		return result;
	}
	
	static boolean primeCheck(int sums, int cnt, int[] primes) {
		boolean b = true;
		int i;
		for(i = 0; i<cnt; i++) {
			if( sums % primes[i] == 0) {
				b = false;
				break;
			}
		}
		if(i == cnt) {
			b = true;
		} else {
			b = false;
		}
		return b;
	}
	
}
