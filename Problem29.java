package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/*
 * 2 ≤ a ≤ 5 이고 2 ≤ b ≤ 5인 두 정수 a, b로 만들 수 있는 ab의 모든 조합을 구하면 다음과 같습니다.

22=4,  23=8,  24=16,  25=32
32=9,  33=27,  34=81,  35=243
42=16,  43=64,  44=256,  45=1024
52=25,  53=125,  54=625,  55=3125
여기서 중복된 것을 빼고 크기 순으로 나열하면 아래와 같은 15개의 숫자가 됩니다.

4,  8,  9,  16,  25,  27,  32,  64,  81,  125,  243,  256,  625,  1024,  3125

그러면, 2 ≤ a ≤ 100 이고 2 ≤ b ≤ 100인 a, b를 가지고 만들 수 있는 ab는 중복을 제외하면 모두 몇 개입니까?
 */
public class Problem29 {

	public static void main(String[] args) {
		Set<BigInteger> set = new HashSet<BigInteger>(); //중복을 허락하지 않는 collection
		
		for(int a=2; a<=100; a++) {
			for(long b=2; b<=100; b++) {
				BigInteger temp= BigInteger.ONE;
				for(long c=0; c<b; c++ ) {
					temp=temp.multiply(BigInteger.valueOf(a));					
				}
				set.add(temp);
			}			
		}
		System.out.println(set.size());
	}

}
