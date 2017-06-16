import java.lang.reflect.Array;
import java.util.ArrayList;


public class OddnumTest {

	public static void main(String[] args) {

	  int i=16;
	  
	  int j=40;
	  oddNumbers(i,j);
	}
//
//	  for(int k=0;k<s.length;k++)System.out.println(s[k]+" ");
//
//	}
//	
	public static void oddNumbers(int l,int r) {
	    	int count=0;
	    	ArrayList ll=new ArrayList();
	    	int z=r-l;
	    	z=z+1;
	    	int[] t = null;
	    	int a[] =new int[z];
	    	for(;l<=r;l++){
	    		int x=l%2;
	    		if(x!=0){
	    			
	    			ll.add(l);
	    			
	    		}
	    	}
	    	Array.get(ll, z);
		
	    }
	
	/*
	private static int[] pushing(int z, int r) {
		int i=0;
		int []p=new int[r];
		for(;i<r;i++){
			p[i]=z;
		}
		return p;
	}
	*/

}
