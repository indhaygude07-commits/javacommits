class maxoccurchar{

	static char highelement(String a){
		int arr[]=new int[256];
		char b[]=a.toCharArray();
		for(int i=0;i<b.length;i++){
		
		arr[b[i]]+=1;
		
		
		}
		int max=-1;
		char h=' ';
		for(int i=0;i<b.length;i++){
		
		if(max<arr[b[i]]){
		
			max=arr[b[i]];
			h=b[i];
		}
		
		
		
		}
		System.out.println(max);

		return h;
				
		
	


	}
	public static void main(String[] args){

		String a= "abcdbbbaddvbbccdavvbdd";

		System.out.println(highelement(a));

	}







}
