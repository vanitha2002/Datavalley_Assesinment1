import java.util.*;
public class MaxEle
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		int max_ele=arr[0];
		for(int i=1;i<n;i++){
		    if(arr[i]>max_ele){
		        max_ele=arr[i];
		    }
		}
		System.out.println(max_ele);
		
	}
}
