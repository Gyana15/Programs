import java.util.Arrays;

public class arrayProduct {
	public static int[] product(int[] orig){
		int prod=1; int[] product = new int[orig.length];
		for(int i=0;i<orig.length;i++){
			if(orig[i]!=0)
				prod=prod*orig[i];
		}
		if(orig.toString().contains("0")){
			for(int i=0;i<orig.length;i++){
				if(orig[i]==0)
					product[i]=prod;
				else
					product[i]=0;
			}
		}
		else{
			for(int i=0;i<orig.length;i++){
				product[i]=prod/orig[i];
			}
		}
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={1,2,3,2,5,9,0};
System.out.println(Arrays.toString(product(a)));
	}

}
