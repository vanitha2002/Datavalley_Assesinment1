import java.util.*;
public class Elecount
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	    int n=input.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr){
		    if(map.containsKey(i)){
		        map.put(i,map.get(i)+1);
		    }else{
		        map.put(i,1);
		    }
		}
		int num_count=input.nextInt();
		System.out.println(map.get(num_count));
		
	}
}
