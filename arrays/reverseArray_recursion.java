//reversing array using recursion
import java.util.*;
class psp
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the requirement : ");
int n=sc.nextInt();
int x[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter a number : ");
x[i]=sc.nextInt();
}
reverse(x,0,n-1);
System.out.println("Array reversed");
for(int i=0;i<n;i++)System.out.println(x[i]);
}
private static void reverse(int x[],int start,int end)
{
if(start>end)return;
int g=x[start];
x[start]=x[end];
x[end]=g;
reverse(x,start+1,end-1);
}
}