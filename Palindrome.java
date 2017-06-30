import java.util.*;
import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int p,q,r,s;
s=a;
while(a!=0)
{
p=a%10;
r=r*10+p;
a=a/10;
}
if(r==s)
{
System.out.println("Palindrome Number");
}
else
{
System.out.println("Not a Palindrome Number");
}
}
}
