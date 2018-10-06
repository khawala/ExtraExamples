import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheHugeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		try {
			in= new File("theHugeOne.txt");
			input=new Scanner(in);
	           int testCase= input.nextInt();
					for(int i=0;i<testCase;i++){
						 long number=input.nextLong();
						input.nextLine();
						String s=input.nextLine();
						String[] arr=s.split("\\s");
						boolean b=true;
						int num;
						for(String temp:arr)
							{num=Integer.parseInt(temp);
							if(number%num==0)
								b=true;
							else{b=false;break;}
							}
								
						System.out.print(number+" - ");
						if(b)
							System.out.println("Wonderful.");
						else
							System.out.println("simple.");
						}
			input.close();}
		
	catch (IOException e){System.out.print("can not find the file");}}
	}


/*That’s the task she was given:
Number  is given, and a set S of different numbers from the interval [1;12]. All
numbers in this set are integers. Number M is said to be wonderful if it is divisible by all numbers in
set S. Find out whether or not number M is wonderful.
Input
First line of input data contains number N . Then N tests follow each described on
two lines. First line of each test case contains number M. Second line contains the number of elements
in a set S followed by a space and the numbers in the set. Numbers of this set are separated by a space
character.
Output
Output one line for each test case: ‘M - Wonderful.’, if the number is wonderful or ‘M - Simple.’
if it is not. Replace M character with the corresponding number. Refer output data for details.
Sample Input
4
0
12 1 2 3 4 5 6 7 8 9 10 11 12
379749833583241
1 11
3909821048582988049
1 7
10
3 1 2 9
Sample Output
0 - Wonderful.
379749833583241 - Wonderful.
3909821048582988049 - Wonderful.
10 - Simple.*/