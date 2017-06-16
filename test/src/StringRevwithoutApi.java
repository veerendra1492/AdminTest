
public class StringRevwithoutApi {
	public static void main(String[] args) {
		String norm="hello how are you";
		StringBuilder strbuil=new StringBuilder(norm.length());
		
		char[] c=norm.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			strbuil.append(c[i]);
			
		}
		System.out.println(strbuil);
	}

}
