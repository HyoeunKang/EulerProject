package euler;
public class Problem27 {
	static int result=Integer.MIN_VALUE;
	static int[] arr = new int[1000];
	public static void main(String[] args) {
		//�Ҽ�Ȯ���� ���� �迭 ����. �Ҽ��̸� ���� -1
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
		}
		//�����佺�׳׽��� ü �˰���
		for(int i=2; i<arr.length; i++) { 
			if(arr[i]==0) continue; //�̹� üũ�� ���� ����� Ȯ������ �ʴ´�.
			for(int j=i*2; j<arr.length; j+=i) { //i�� ������ i�� ������� 0���� üũ
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
				if(arr[b]!=-1) continue; //b�� �Ҽ����� �Ѵ�
				if((a+b)%2==0||(-1*b)>=a) continue;
				int temp= 1+a+b;//1+a+b�� �Ҽ����� �Ѵ�.
				if(temp<0||temp>999||(arr[temp]!=-1)) continue;
				//result�� ���� ����� �� �� � ���� ������ �� ū��?
				System.out.println("����:"+a+","+b);
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
		//�Ҽ��� ��� ����°�?
		int n=0;
		for(n=0; ;n++) {
			int temp = n*n+n*a+b;
			if(temp<0||temp>999||arr[temp]==0) break; //�����ų� �Ҽ��� �ƴϸ� ����
		}
		return n-1;
	}
}
