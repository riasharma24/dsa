//insertion sort
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
int j,num,y;
for(y=1;y<=n-1;y++)
{
num=x[y];
j=y-1;
while(j>=0 && num<=x[j])
{
x[j+1]=x[j];
j--;
}
x[j+1]=num;
}
System.out.println("Array sorted");
for(int i=0;i<n;i++)System.out.println(x[i]);
}
}