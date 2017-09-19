package euler;
/*
 * ���� �ʰ��� ���ϴ� ���� �ƴ϶� ���� �ٸ� �ʰ��� ���ص� �ȴ�!
 */

public class Problem23 {
	static int[] arr = new int[28124];
	public static void main(String[] args) {
		long sum=0;
		int sqrt = (int) Math.sqrt(28123);
		//�ʱ�ȭ �۾�
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		//�Ҽ� �ƴ� �� ã��
		for(int i=2; i<sqrt; i++) {
			if(arr[i]==0) continue;
			for(int j=i*2; j<arr.length; j+=i) {
				arr[j]=0;
			}
		}
		//�ʰ����̸� �ش� �ڿ��� �ε������� 0��
		//a�� �ʰ����̸�, a�� ��� ���� �ʰ����̴�?
		for(int i=1; i<arr.length; i++) {
			int temp=0;
			if(arr[i]==-1) continue;
			temp=dd(i);
			//System.out.println("temp:"+temp);
			if(temp>i) {
				
				for(int j=i*2; j<arr.length; j+=i) {
					System.out.println("���� j: "+j);
					arr[j]=0;
				}
			}
		}
		//�ʰ��� �� ���� ������ ��Ÿ�� �� ���� ��� ���� ������ �� ���ϱ�
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
