package euler;


/*
 *  n�� ����� �߿��� �ڽ��� ������ ���� ���� d(n)���� �������� ��,
	���� �ٸ� �� ���� a, b�� ���Ͽ� d(a) = b �̰� d(b) = a �̸� 
	a, b�� ģȭ���̶� �ϰ� a�� b�� ���� ģȭ��(��ּ�)��� �մϴ�.

	���� ��� 220�� ����� �ڽ��� �����ϸ� 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 �̹Ƿ� �� ���� d(220) = 284 �Դϴ�.
	�� 284�� ����� �ڽ��� �����ϸ� 1, 2, 4, 71, 142 �̹Ƿ� d(284) = 220 �Դϴ�.
	���� 220�� 284�� ģȭ���� �˴ϴ�.

	10000 ������ ģȭ������ ��� ã�Ƽ� �� ���� ���ϼ���.
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
		//�����佺�׳׽��� ü �˰���
		for(int i=2; i<sqrt; i++) { 
			if(arr[i]==0) continue; //�̹� üũ�� ���� ����� Ȯ������ �ʴ´�.
			for(int j=i*2; j<arr.length; j+=i) { //i�� ������ i�� ������� 0���� üũ
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
