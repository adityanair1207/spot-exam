public class Fibo {

int pow(int x, int y) {
		if(y==0) {
			return 1;
		}
		if(y%2==0) {
			return pow(x,y/2)*pow(x,y/2);
		}
		return x*pow(x,y/2)*pow(x,y/2);
	}
	
	int ord(int x) {
		int n = 0;
		while(x!=0) {
			n++;
			x=x/10;
		}
		return n;
	}
	
	boolean isArm(int x) {
		int n = ord(x);
		int temp = x;
		int sum = 0;
		while(temp!=0) {
			int r = temp%10;
			sum = sum + pow(r,n);
			temp = temp/10;
		}
		return (sum==x);
	}

	public static void main(String[] args) {
		Arms obj = new Arms();
		int x = 372;
		System.out.println(obj.isArm(x));
		
	}

}