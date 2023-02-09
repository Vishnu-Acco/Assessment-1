import java.util.*;
public class SplitArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int first[]=new int[n/2];
		int second[]=new int[n/2];
		int sum1=0,sum2=0;
		Arrays.sort(arr);
		int x=0,y=0;
		first[x++]=arr[n-1];
		sum1=arr[n-1];
		second[y++]=arr[n-2];
		sum2=arr[n-2];
		for(int i=n-3;i>=0;i--) {
			if(sum1>sum2) {
				if(y<=n/2) {
					sum2=sum2+arr[i];
					second[y]=arr[i];
					y++;
				}	
			}
			else {
				if(x<=n/2) {
					sum1=sum1+arr[i];
					first[x]=arr[i];
					x++;
				}
			}
		}
		int i=0;
		x=0;
		y=0;
		while(x<n/2) {
			arr[i++]=second[x++];
		}
		while(y<n/2) {
			arr[i++]=first[y++];
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}

}
