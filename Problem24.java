package euler;

import java.util.Arrays;

public class Problem24 {
/*	� ����� ������ ���� �迭�� ���� �����̶�� �մϴ�. ���� ��� 3124�� ���� 1, 2, 3, 4�� ���� �� �ִ� ���� �� �ϳ��Դϴ�.

	�̷��� ���� �� �ִ� ��� ������ ���ڳ� ���� ������ �þ���� ���� ������(lexicographic) ������� �մϴ�.
	0, 1, 2�� ���� �� �ִ� ������ ������ ������ �����ϴ�.

	012   021   102   120   201   210
	0, 1, 2, 3, 4, 5, 6, 7, 8, 9�� ���� �� �ִ� ������ �������� 1,000,000��°�� �����Դϱ�?*/
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int[] ans = new int[10];
		int search = 1000000;
		
		int temp = 0;
		
		for(int i=9; i>=0; i--) {
			temp = fact(i);
			
			int quotient = search/temp; //��==�ε���
			int remin = search%temp;
			
			if(remin==0) {
				quotient--;
				remin = temp;
			}
			ans[9-i]=arr[quotient];
			for(int j=quotient; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			search=remin;
		}
		System.out.println(Arrays.toString(ans));
	}
	//���丮���� ���ϴ� �Լ�
	static int fact(int n) {
		if(n<2) return 1;
		
		int result=1;
		for(int i=2; i<=n; i++) {
			result*=i;
		}
		return result;
	}
}
