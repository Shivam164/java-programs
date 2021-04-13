import java.util.Scanner;
public class Array {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		} int first = 0;
        int last = n-1;
        int mid = (n-1)/2;
        
        while(first<=mid){
            if(arr[mid]<arr[first]){
                first = mid;
                mid=(first + last)/2;
            }else{
                mid=(first+mid)/2;
            }
            if(mid!=0 && mid!=n-1) {
            if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
                break;
            }}else {
            	break;
            }
        }
        System.out.println(arr[mid]);
		
		

	}

}
