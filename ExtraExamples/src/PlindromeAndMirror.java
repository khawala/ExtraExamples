import java.io.File;
import java.util.Scanner;

public class PlindromeAndMirror {
	public static boolean palindrom(String str)
	{String temp="";
		for (int i=str.length()-1;i>=0;i--)
		temp=temp+str.charAt(i);
	boolean p=temp.equals(str);
	return p;
	}
	


	public static boolean mirrored(String str)
	{String tempM="";
	for (int i=str.length()-1;i>=0;i--)
	tempM=tempM+str.charAt(i);
	char o,m;
	boolean p=true;
	String orignal="AEHIJLMOSTUVWXYZ12358";
	String mirrored="A3HILJMO2TUVWXY51SES8";
	for (int i=0;i<str.length();i++)
	{p=false;
	o=str.charAt(i);
	m=tempM.charAt(i);
		if(orignal.indexOf(o)==mirrored.indexOf(m))
		p=true;
		else break;}
	if(p)
	{
	return true;}
	else
		return false;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool1,bool2;
		String s;
		Scanner input = new Scanner(System.in);
		File IFile;
		try		{
			IFile=new File("inf.txt");
			 input=new Scanner(IFile);

		while(input.hasNextLine()){
		s=input.nextLine();
		String tempM="";
		for (int i=s.length()-1;i>=0;i--)
			tempM=tempM+s.charAt(i);
		bool1=palindrom(s);
		bool2=mirrored(s);
		if(bool1&&bool2)
			System.out.println("is a mirrored palindrom.");
		else if(bool1&&bool2==false)
			System.out.println("is a regular palindrom.");
		else if(bool2)
			System.out.println("is a  mirrored string.");
		else
			System.out.println("is not a palindrom.");
		}
		input.close();}
		
		
	catch (Exception e){
		System.out.println("error in read the file");
	}
		
	}

}
/*A regular palindrome is a string of numbers or letters that is the same forward as backward. For
example, the string “ABCDEDCBA” is a palindrome because it is the same when the string is read from
left to right as when the string is read from right to left.
A mirrored string is a string for which when each of the elements of the string is changed to its
reverse (if it has a reverse) and the string is read backwards the result is the same as the original string.
For example, the string “3AIAE” is a mirrored string because ‘A’ and ‘I’ are their own reverses, and ‘3’
and ‘E’ are each others’ reverses.
A mirrored palindrome is a string that meets the criteria of a regular palindrome and the criteria
of a mirrored string. The string “ATOYOTA” is a mirrored palindrome because if the string is read
backwards, the string is the same as the original and because if each of the characters is replaced by
its reverse and the result is read backwards, the result is the same as the original string. Of course, ‘A’,
‘T’, ‘O’, and ‘Y’ are all their own reverses.
A list of all valid characters and their reverses is as follows.

Character Reverse Character Reverse Character Reverse
A           A           M     	 M 		Y 		Y
B 			            N			  	Z 		5
C					    O 		O 		1 		1
D 						P               2 		S
E			3		    Q 				3		E
F 						R 				4
G					    S 		2		5 		Z
H 			H 			T 		T 		6
I 			I		    U       U 		7
J		    L		    V 		V 		8 		8
K 						W 		W 		9
L		    J 			X	    X

Note that ‘0’ (zero) and ‘O’ (the letter) are considered the same character and therefore ONLY the
letter ‘O’ is a valid character.
Input
Input consists of strings (one per line) each of which will consist of one to twenty valid characters.
There will be no invalid characters in any of the strings. Your program should read to the end of file.
Output
For each input string, you should print the string starting in column 1 immediately followed by exactly
one of the following strings.
STRING CRITERIA
‘ -- is not a palindrome.’              if the string is not a palindrome and is not a mirrored string
‘ -- is a regular palindrome.’          if the string is a palindrome and is not a mirrored string
‘ -- is a mirrored string.’             if the string is not a palindrome and is a mirrored string
‘ -- is a mirrored palindrome.’         if the string is a palindrome and is a mirrored string
Note that the output line is to include the ‘-’s and spacing exactly as shown in the table above and
demonstrated in the Sample Output below.
In addition, after each output line, you must print an empty line.

Sample Input
NOTAPALINDROME
ISAPALINILAPASI
2A3MEAS
ATOYOTA

Sample Output
NOTAPALINDROME -- is not a palindrome.
ISAPALINILAPASI -- is a regular palindrome.
2A3MEAS -- is a mirrored string.
ATOYOTA -- is a mirrored palindrome.*/
