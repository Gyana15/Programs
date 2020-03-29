import java.util.Arrays;

public class separatingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={2,3,4,2,0,4,5,0,0,0,3,0,3,5,0,6,3,4,7,4};
int count,k=0,temp;
for(int i=0;i<a.length;i++){
	count=0;
	if(a[i]==0){
		k=i;
		while(count==0){
			if(k==a.length-1) break;
			if(a[i]!=a[++k]){
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				count=count+1;
			}
		}
	}
}
System.out.println(Arrays.toString(a));
	}

}
