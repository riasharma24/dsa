//linear sort
import java.util.Scanner;
class psp
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the requirement : ");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter a number : ");
arr[i]=sc.nextInt();
}
int e,f,g;
for(e=0;e<=n-2;e++)
{
for(f=e+1;f<=n-1;f++)
{
if(arr[e]>arr[f])
{
g=arr[e];
arr[e]=arr[f];
arr[f]=g;
}
}
}
System.out.println("Sorted array");
for(e=0;e<n;e++)System.out.println(arr[e]);
}
}