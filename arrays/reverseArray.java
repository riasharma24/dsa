//reverse an array
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
int e,f,g;
e=0;
f=n-1;
while(e<f)
{
g=x[e];
x[e]=x[f];
x[f]=g;
e++;
f--;
}
System.out.println("Array reversed");
for(int i=0;i<=n-1;i++)System.out.println(x[i]);
}
}