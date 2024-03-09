//find min and max elem of an array by iterating 
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
int min,max;
min=x[0];
max=x[0];
for(int i=0;i<n;i++)
{
if(x[i]>max)max=x[i];
if(x[i]<min)min=x[i];
}
System.out.println("Minimum : "+min);
System.out.println("Maximum : "+max);
}
}