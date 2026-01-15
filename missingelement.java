class missing{
	
	static int missingelement(int a[], int n){

		int totalsum=n*(n+1)/2;
		int actualsum=0;
		for(int i=0;i<a.length;i++){
			actualsum+=a[i];
		
		
		}
		return (totalsum-actualsum);
	
	
	
	}





	public static void main(String[] args){
	
		int arr[]={0,1,2,6,5,4,7,8,9};
		int n=arr[arr.length-1];
		System.out.println(missingelement(arr,n));
	
	
	
	
	
	}







}
