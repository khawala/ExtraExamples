import java.io.*;
import java.util.Scanner;


public class Periodic {
	
	public static void checkPeriodic(String str)
	{
		String temp;
		int i;
		for( i=1;i<str.length()&&str.charAt(0)!=str.charAt(i);i++)
		{
			temp=str.substring(0, i+1);
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		File IFile;
		String Sstr;
		int NumOfWrod;
		try		
		{
			IFile=new File("new.txt");
			 input=new Scanner(IFile);
			 NumOfWrod=input.nextInt();
			 String s=String.valueOf(NumOfWrod);
			 for(  int i=0;i<NumOfWrod;i++)
			 { Sstr=input.next();		// TODO Auto-generated method stub
		       checkPeriodic(Sstr);
	}}
		catch (IOException e)
		{
		System.out.println("error in read the file");
	}}}
/*periodic string
character string is said to have period k if it can be formed by concatenating one or more repetitions
of another string of length k. For example, the string ”abcabcabcabc” has period 3, since it is formed
by 4 repetitions of the string ”abc”. It also has periods 6 (two repetitions of ”abcabc”) and 12 (one
repetition of ”abcabcabcabc”).
Write a program to read a character string and determine its smallest period.
Input
The first line oif the input file will contain a single integer N indicating how many test case that your
program will test followed by a blank line. Each test case will contain a single character string of up
to 80 non-blank characters. Two consecutive input will separated by a blank line.
Output
An integer denoting the smallest period of the input string for each input. Two consecutive output are
separated by a blank line.
Sample Input
1
HoHoHo
Sample Output
2
*/


