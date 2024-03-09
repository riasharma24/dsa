//reversing array using stack
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
Stack<Integer> stk=new Stack<>();
for(int j=0;j<n;j++)stk.push(x[j]);
for(int j=0;j<n;j++)x[j]=stk.pop();
for(int j=0;j<n;j++)System.out.println(x[j]);
}
}