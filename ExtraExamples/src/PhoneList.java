import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PhoneList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =null;
		File IFile;
		int numOfCase;
		try		
		{IFile=new File("phonelist.txt");
			 input=new Scanner(IFile);
			 
			 numOfCase=input.nextInt();
			 for(int i=0;i<numOfCase;i++)
			 {int s=input.nextInt();
			 input.nextLine();
			 int min=0;
			 String[] list=new String[s];
			 for(int j=0;j<s;j++)
			 { list[j]=input.nextLine();
				 if(list[j].length()<=min)
					 min=j;
				 }
			 String temp=list[min];
			 boolean b=true;
			 for(int k=0;k<s;k++)
			 {b=true;
			 String temp2=list[k];
			if(temp2.startsWith(temp)&&!(temp2.equals(temp)))
				{b=false;
			break;
			 }}
			 if(b)
				 System.out.println("YES");
			 else
				 System.out.println("NO");
				 
			 } input.close();}
		catch (IOException e){System.out.print("can not find the file");}}}

/*Phone List:

Given a list of phone numbers, determine if it is consistent in the sense that
no number is the prefix of another. Let’s say the phone catalogue listed these numbers:
	• Emergency 911
	• Alice 97 625 999
	• Bob 91 12 54 26
	In this case, it’s not possible to call Bob, because the central would direct
	your call to the emergency line as soon as you had dialled the first three digits of
	Bob’s phone number. So this list would not be consistent.
	Input
           The first line of input gives a single integer, the number of test cases. Each test case starts
	with n, the number of phone numbers, on a separate line, Then follows n lines with
	one unique phone number on each line. A phone number is a sequence of at most ten digits.
	Output
	For each test case, output ‘YES’ if the list is consistent, or ‘NO’ otherwise.
	Sample Input
	2
	3
	911
	97625999
	91125426
	5
	113
	12340
	123440
	12345
	98346
	Sample Output
	NO
    YES  
*/
