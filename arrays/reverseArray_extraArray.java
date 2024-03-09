//reverse an array using extra array
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
int rev[]=new int[n];
for(int i=0;i<n;i++)rev[i]=x[n-i-1];
System.out.println("Array reversed");
for(int i=0;i<n;i++)System.out.println(rev[i]);
}
}