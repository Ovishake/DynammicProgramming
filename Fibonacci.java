package cs263_4;

import java.util.*;

public class Q1 {
    static long st,et;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = fibonacci(a);
		System.out.println("Time : "+(et-st));
	}
	static String fibonacci(String a)
	{
		st = System.nanoTime();
		if(a.equals("0") || a.equals("1"))
		         return a;
		else
		{
		    String s1 = fibonacci(sub(a, "1"));
		    String s2 = fibonacci(sub(a, "2"));
		    et = System.nanoTime();
		    return add(s1, s2);
		}
	}
	static String sub(String a, String b) {
		if(a.equals(b))
			return "0";
		int n1 = a.length();
		int n2 = b.length();
		int n = 0;
		if(n1>n2)
		{
			for(int i=0;i<(n1-n2);i++)
			    b = '0' + b;
			n = n1;
		}
		else
		{
			for(int i=0;i<n2-n1;i++)
				a = '0' + a;
			n = n1;
		}
		int sub=0, c=0;
		String s ="";
		for(int i=n-1;i>=0;i--)
		{
			sub = ((a.charAt(i)-'0')-(b.charAt(i)-'0')-c);
			if(sub < 0)
			{
				sub = sub + 10;
				c = 1;
			}
			else
			{
				c = 0;
			}
			s = s + (char)(sub+'0');
		}
        s = new StringBuilder(s).reverse().toString();
    	
        while(s.startsWith("0"))
    		s = s.substring(1);
        
    	return s;
	}
	static String add(String a, String b) {
		int n1 = a.length();
		int n2 = b.length();
		int n = 0;
		if(n1>n2)
		{
			for(int i=0;i<(n1-n2);i++)
			    b = '0' + b;
			n = n1;
		}
		else
		{
			for(int i=0;i<n2-n1;i++)
				a = '0' + a;
			n = n1;
		}
		int sum = 0,c=0;
		String s = "";
		for(int i=n-1;i>=0;i--)
		{
			sum = (a.charAt(i)-'0')+(b.charAt(i)-'0')+c;
			c = sum/10;
			sum = sum%10;
			s = s+(char)(sum+'0');
		}
		if(c>0)
		{
			s = s+(char)(c+'0');
		}
        s = new StringBuilder(s).reverse().toString();
    	
        return s;	
    	}
	}
