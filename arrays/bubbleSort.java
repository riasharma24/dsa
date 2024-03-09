//bubble sort
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
int i,j,m,g;
for(m=n-2;m>=0;m--)
{
i=0;
j=1;
while(i<=m)
{
if(x[i]>x[j])
{
g=x[i];
x[i]=x[j];
x[j]=g;
}
i++;
j++;
}
}
System.out.println("Array sorted");
for(i=0;i<n;i++)System.out.println(x[i]);
}
}