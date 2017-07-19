# given-prime
import java.io.*;
import java.util.*;
public class given prime
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int S1,S2,S3,flag=0,i,j;
System.out.println("The prime numbers in between entered limits are:");
for(i=s1;i<=s2;i++)
{
for(j=2;j<1;j++)
{
if(i%j==0)
{
flag=0;
break;
}
else
{
flag=1;
}
}
if(flag==1)
{
System.out.println(i);
}
}
}
}
