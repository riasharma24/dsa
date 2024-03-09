//finding minimum and maximum elements of an array using sorting
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
Arrays.sort(x);
System.out.println("Minimum : "+x[0]);
System.out.println("Maximum : "+x[n-1]);
}
}