import java.util.Arrays;


class anagram{
	
	
	static boolean checkanagram(String a,String b){
	
	char arr1[]=a.toCharArray();
	char arr2[]=b.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(arr1.length==arr2.length){
	for(int i=0;i<arr1.length;i++){
	
		if(arr1[i]!=arr2[i]){

			return false;
				
		}
		
	}
	return true;
		
	}else{
		return false;
	
	}

	}
	
	public static void main(String[] args){
	
	String a= "abcd";
	String b="dbac";
	
	System.out.println(checkanagram(a,b));

	
	}





}
