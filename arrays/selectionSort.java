//selection sort
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
int y,e,si,g;
for(y=0;y<n;y++)
{
si=y;
for(e=y+1;e<n;e++)if(x[si]>x[e])si=e;
g=x[y];
x[y]=x[si];
x[si]=g;
}
System.out.println("Array sorted");
for(int i=0;i<n;i++)System.out.println(x[i]);
}
}