class reverseString{
	static void rev(String b){
	char a[]=b.toCharArray();
	char temp =' ';
	for(int i=0;i<a.length/2;i++){
		temp=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=temp;
	
	
	
	}
	for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
	}
	}

	public static void main(String[] args){
	
	String a="ishwar" ;
	rev(a);

	
	
	
	}





}
