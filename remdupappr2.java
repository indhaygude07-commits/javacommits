
import java.util.Arrays;

class remduplicatesappr2{

	public static void main(String[] args){
	
	int arr[]={1,2,2,5,6,4,1,2,3,4,6,8,10};
	Arrays.sort(arr);
	
	int rd=0;
	
	for(int i=1;i<arr.length;i++){
		if(arr[rd]!=arr[i]){
			rd++;
			arr[rd]=arr[i];
		}
		
	}
	for(int i=0;i<=rd;i++){
		System.out.println(arr[i]);
	}
	
	
	}




}
