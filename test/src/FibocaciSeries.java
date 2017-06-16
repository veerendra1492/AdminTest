
public class FibocaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		//0 1 1 2 3 5 8 13 21 
		for(int i=1;i<100;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}

	}

}
