import java.io.*;
import java.io.IOException;
import java.util.*;

public class SecretWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		try {
			in= new File("secret.txt");
			input=new Scanner(in);
			String str1;
			String str2="";
	            input.nextInt();
					while(input.hasNextLine()){
						String str=input.nextLine();
						
		if(palindrom(str))
							System.out.println(str);
		
		else
		{char ch=str.charAt(0);
			int t=str.lastIndexOf(ch);
						for(int k=t;k>0;k--)
							
							 {
							str1=str.substring(k-1,t+1);
							 String reverse = new StringBuffer(str1).reverse().toString();
							if(str.startsWith(reverse))
								{str2=str1;
								continue;}
							else
								break;	}
						System.out.println(str2);
						}}
			input.close();}
		
	catch (IOException e){System.out.print("can not find the file");}}

	
public static boolean palindrom(String str)
{String temp="";
for (int i=str.length()-1;i>=0;i--)
temp=temp+str.charAt(i);
boolean p=temp.equals(str);
return p;}
}
