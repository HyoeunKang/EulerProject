package euler;

import java.math.BigInteger;

/*
 * �Ǻ���ġ ������ �Ʒ��� ���� ��ȭ������ ���ǵ˴ϴ�.

Fn = Fn-1 + Fn-2  (��, F1 = 1, F2 = 1).
�̿� ���� ������ 12��° �ױ��� ���ʴ�� ����ϸ� ������ �����ϴ�.

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
������ ���� F12���� ó������ 3�ڸ��� �˴ϴ�.

�Ǻ���ġ �������� ���� ó������ 1000�ڸ��� �Ǵ� ���� ���° ���Դϱ�?
 */
public class Problem25 {
	public static void main(String[] args) {
		int count=2;
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		BigInteger c = new BigInteger("2");
		
		BigInteger target = new BigInteger("10");
		for(int i=1; i<=1000; i++) {
			target=target.multiply(BigInteger.valueOf(10));
		}
		while(c.compareTo(target)<0) {
			c=a.add(b);
			a=b;
			b=c;

			count++;
		}
		System.out.println(count);
	}
}
