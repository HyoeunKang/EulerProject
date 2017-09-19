package euler;
/*
 * 같은 초과수 더하는 것이 아니라 서로 다른 초과수 더해도 된다!
 */

public class Problem23 {
	static int[] arr = new int[28124];
	public static void main(String[] args) {
		long sum=0;
		int sqrt = (int) Math.sqrt(28123);
		//초기화 작업
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		//소수 아닌 것 찾기
		for(int i=2; i<sqrt; i++) {
			if(arr[i]==0) continue;
			for(int j=i*2; j<arr.length; j+=i) {
				arr[j]=0;
			}
		}
		//초과수이면 해당 자연수 인덱스값은 0임
		//a가 초과수이면, a의 배수 또한 초과수이다?
		for(int i=1; i<arr.length; i++) {
			int temp=0;
			if(arr[i]==-1) continue;
			temp=dd(i);
			//System.out.println("temp:"+temp);
			if(temp>i) {
				
				for(int j=i*2; j<arr.length; j+=i) {
					System.out.println("현재 j: "+j);
					arr[j]=0;
				}
			}
		}
		//초과수 두 개의 합으로 나타낼 수 없는 모든 양의 정수의 합 구하기
		for(int i=1; i<arr.length-1; i++) {
			if(arr[i]==-1) {
				sum+=i;
			}
		}
		System.out.println(arr[24]);
		System.out.println(sum);
	}
	static int dd(int n) {
		int result=0;
		for(int i=1; i<n; i++) {
			if(n%i==0) {
				result+=i;
			}
		}
		System.out.println("n: "+n+","+result);
		return result;
	}
}
