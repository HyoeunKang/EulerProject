package euler;
public class Problem27 {
	static int result=Integer.MIN_VALUE;
	static int[] arr = new int[1000];
	public static void main(String[] args) {
		//소수확인을 위한 배열 생성. 소수이면 값이 -1
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		//에라토스테네스의 체 알고리즘
		for(int i=2; i<arr.length; i++) { 
			if(arr[i]==0) continue; //이미 체크된 수의 배수는 확인하지 않는다.
			for(int j=i*2; j<arr.length; j+=i) { //i를 제외한 i의 배수들은 0으로 체크
				arr[j]=0;
			}
		}
		sol();
		System.out.println(result);
	}
	static int sol() {
		int a=0,b=0;
		int max_a=0,max_b=0;
		int max_temp=0;
		for(a=-999; a<1000; a++) {
			for(b=2; b<1000; b++) {
				if(arr[b]!=-1) continue; //b는 소수여야 한다
				if((a+b)%2==0&&(-1*b)>=a) continue;
				int temp= 1+a+b;//1+a+b도 소수여야 한다.
				if(temp<0||temp>999||(arr[temp]!=-1)) continue;
				//result와 새로 계산한 값 중 어떤 것의 범위가 더 큰가?
				System.out.println("여기:"+a+","+b);
				max_temp = maxPrimenum(a, b);
				if(result<max_temp) {
					result=max_temp;
					max_a=a; max_b=b;
				}
			} 
		}
		System.out.println(max_a+","+max_b);
		return result;
	}
	static int maxPrimenum(int a, int b) {
		//소수는 어디서 끊기는가?
		int n=0;
		for(n=0; ;n++) {
			int temp = n*n+n*a+b;
			if(temp<0||temp>999||arr[temp]==0) break; //음수거나 소수가 아니면 종료
		}
		return n-1;
	}
}
