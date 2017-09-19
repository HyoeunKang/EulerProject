package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/*
 * 2 �� a �� 5 �̰� 2 �� b �� 5�� �� ���� a, b�� ���� �� �ִ� ab�� ��� ������ ���ϸ� ������ �����ϴ�.

22=4,  23=8,  24=16,  25=32
32=9,  33=27,  34=81,  35=243
42=16,  43=64,  44=256,  45=1024
52=25,  53=125,  54=625,  55=3125
���⼭ �ߺ��� ���� ���� ũ�� ������ �����ϸ� �Ʒ��� ���� 15���� ���ڰ� �˴ϴ�.

4,  8,  9,  16,  25,  27,  32,  64,  81,  125,  243,  256,  625,  1024,  3125

�׷���, 2 �� a �� 100 �̰� 2 �� b �� 100�� a, b�� ������ ���� �� �ִ� ab�� �ߺ��� �����ϸ� ��� �� ���Դϱ�?
 */
public class Problem29 {

	public static void main(String[] args) {
		Set<BigInteger> set = new HashSet<BigInteger>(); //�ߺ��� ������� �ʴ� collection
		
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
