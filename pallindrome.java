class pallindrome{
	
	static boolean  checkpallindrome(String a){
		char abc[]=a.toCharArray();
		for(int i=0;i<abc.length/2;i++){
			int j= abc.length-1-i;
			if(abc[i]!=abc[j]){
			
			return false;
			}
		
		
		
		
		
		}

		return true;
	
	
	
	
	
	}
	
	
	public static void main(String[] args){
	
	String a= "a";
	System.out.println(checkpallindrome(a));
	
	
	
	
	
	}





}
