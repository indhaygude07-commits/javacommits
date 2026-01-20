class vowels{
	static void count(String a){
	a=a.toLowerCase();
	int vowels=0;
	int consonant=0;	
	for(int i=0;i<a.length();i++){
		char ch=a.charAt(i);
		if(ch>='a'&&ch<='z'){
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
			vowels++;
		
		
		
		}else{
		
		consonant++;
		
		}

		
		
		}
	
	

	
	
	
	}
	System.out.println("vowels: "+vowels);
	System.out.println("consonant :  "+consonant);
	
	}
	
	
	
	
	public static void main(String[] args){
	
	String a="abcdefghijklmnopqrstuvwxyz";
	count(a);	
	
	
	
	
	}







}
