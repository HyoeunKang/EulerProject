package euler;

public class Problem30 {
	//한계점(상한선)은 어디인가?
	//9^5=59049
	//999999 =>354294
	//2222222->114688
	//9999999=>413343
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long result=0;
		//354294
		for(int i=0; i<=354294; i++) {
			int sum=0, num=i;
			
			while(num>0) {
				int temp = num%10;
				int temp2 = temp;
				num/=10;
				for(int j=0; j<4; j++) {
					temp2*=temp;
				}
				sum += temp2;
			}
			if(i==sum) {
				result+=i;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("결과는 "+result);
		System.out.println("연산시간:"+(endTime-startTime)+"s");
	}

}
