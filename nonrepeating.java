class nonrepeating{

	static char  nonrepeat(String a){
	int arr[]=new int[256];
	for(int i=0;i<a.length();i++){
	
		arr[a.charAt(i)]+=1;
	
	
	}
	char c=' ';
	for(int i=0;i<a.length();i++){

		if(arr[a.charAt(i)]==1){
		
		c=a.charAt(i);
		break;	
		}
	
	
	}
	return c;
	
	
	
	
	}

	public static void main(String[] args){
	
	String a="ssddeffbfgjg";
	System.out.println(nonrepeat(a));
	
	
	
	}






}
