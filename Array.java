public class Array{
	public static void main(String args[]){
		int a[]={55, 22, 33, 54, 88, 99};
		int temp=0;
		for(int i=0; i<a.length; i++){
			for(int j=i; j<a.length; j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}System.out.println();
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
}