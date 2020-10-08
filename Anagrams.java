package hackerrank;
import java.io.*;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first string ");
		String a=in.next();
		System.out.println("Enter the second String");
		String b=in.next();
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		int i,count=0;
		for(i=0;i<c.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
			if(c[i]==d[j] && d[j]!='0')
			{
				count++;
				//d[j]='0';
				//break;
				
			}
		}}
		System.out.println("output is "+((c.length+d.length)-(count*2)));
	}

}
