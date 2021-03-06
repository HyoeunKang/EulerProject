package euler;

import java.util.Arrays;

public class Problem24 {
/*	어떤 대상을 순서에 따라 배열한 것을 순열이라고 합니다. 예를 들어 3124는 숫자 1, 2, 3, 4로 만들 수 있는 순열 중 하나입니다.

	이렇게 만들 수 있는 모든 순열을 숫자나 문자 순으로 늘어놓은 것을 사전식(lexicographic) 순서라고 합니다.
	0, 1, 2로 만들 수 있는 사전식 순열은 다음과 같습니다.

	012   021   102   120   201   210
	0, 1, 2, 3, 4, 5, 6, 7, 8, 9로 만들 수 있는 사전식 순열에서 1,000,000번째는 무엇입니까?*/
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
		int[] ans = new int[10];
		int search = 1000000;
		
		int temp = 0;
		
		for(int i=9; i>=0; i--) {
			temp = fact(i);
			
			int quotient = search/temp; //몫==인덱스
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
	//팩토리얼을 구하는 함수
	static int fact(int n) {
		if(n<2) return 1;
		
		int result=1;
		for(int i=2; i<=n; i++) {
			result*=i;
		}
		return result;
	}
}
