class rotatearray{
	static void arrayrotateone(int a[]){
	 int temp=a[0];
	 for(int i=1;i<a.length;i++){
	 	
		a[i-1]=a[i];
	
	 }
	 a[a.length-1]=temp;
	
	}
	static void arrayrotate(int a[],int k){
		if((a.length)<k){
		k=(k%(a.length));
		}	
		for(int i=0;i<k;i++){
		arrayrotateone(a);
		}
	
	}
	
	public static void main(String[] args){
	
	
	int arr[]={1,2,3,4,5};
	arrayrotate(arr,7);
	
	 for(int i=0;i<arr.length;i++){
	 	System.out.print(arr[i]);
		}
	 System.out.println();

	
	}

		
}
