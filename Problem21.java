package euler;


/*
 *  n의 약수들 중에서 자신을 제외한 것의 합을 d(n)으로 정의했을 때,
	서로 다른 두 정수 a, b에 대하여 d(a) = b 이고 d(b) = a 이면 
	a, b는 친화쌍이라 하고 a와 b를 각각 친화수(우애수)라고 합니다.

	예를 들어 220의 약수는 자신을 제외하면 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 이므로 그 합은 d(220) = 284 입니다.
	또 284의 약수는 자신을 제외하면 1, 2, 4, 71, 142 이므로 d(284) = 220 입니다.
	따라서 220과 284는 친화쌍이 됩니다.

	10000 이하의 친화수들을 모두 찾아서 그 합을 구하세요.
 */
public class Problem21 {

	public static void main(String[] args) {
		//start time
		long sT = System.currentTimeMillis();
		
		int[] arr = new int[10000];
		int sqrt = (int) Math.sqrt(10000);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		//에라토스테네스의 체 알고리즘
		for(int i=2; i<sqrt; i++) { 
			if(arr[i]==0) continue; //이미 체크된 수의 배수는 확인하지 않는다.
			for(int j=i*2; j<arr.length; j+=i) { //i를 제외한 i의 배수들은 0으로 체크
				arr[j]=0;
			}
		}
		
		long sum=0;
		
		for(int i=10; i<arr.length; i++) {
			if(arr[i]!=-1) {
				int temp1 = d(i);
				int temp2 = d(temp1);
				
				if(i==temp2&&i!=temp1) {
					sum+=i+temp1;
					arr[i]=-1;
					arr[temp1]=-1;
				}
			}
		}
		//end time
		long eT = System.currentTimeMillis();

		System.out.println("TIME:"+(eT-sT)+"(ms)");
		System.out.println(sum);
	}
	static int d(int n) {
		int result=0;
		
		for(int i=1; i<n; i++) {
			if(n%i==0) result+=i;
		}
		return result;
	}
}
