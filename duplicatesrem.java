import java.util.Arrays;

class remduplicates{

	public static void main(String[] args){
	
	int arr[]={1,2,2,5,6,4,1,2,3,4,6,8,10};
	Arrays.sort(arr);
	int temp[]=new int[arr.length];
	int rd=0;
	temp[rd]=arr[rd];
	for(int i=1;i<arr.length;i++){
		if(temp[rd]!=arr[i]){
			rd++;
			temp[rd]=arr[i];
		}
		
	}
	for(int i=0;i<temp.length;i++){
		System.out.println(temp[i]);
	}
	
	
	}




}
