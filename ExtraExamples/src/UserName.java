import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in=null;
		Scanner input=null;
		try {
			in= new File("userName.txt");
			input=new Scanner(in);
			
	            int testCase=input.nextInt();
	            input.nextLine();
					for(int i=0;i<testCase;i++){
						String str=input.nextLine();
						int charCount=0;
						boolean b=true ,b1=true;
						for(int j=0;j<str.length()&&b&&b1;j++)	
						{str=str.toLowerCase();
						b1=false;
						b=false;
					if((str.charAt(j)<='z'&&'a'<=str.charAt(j))||(str.charAt(j)<='9'&&'0'<=str.charAt(j))||str.charAt(j)=='_')
								{charCount++;b=true;}
							else{b=true;break;}
								
						if((str.charAt(0)<='z'&&'a'<=str.charAt(0)))b1=true;
							else{b1=false;	break;}}
								
						if((8<=charCount&&charCount<=30)&&b1&&b)
						System.out.println("Valid");
						
						else
						System.out.println("Invalid");
						}
			input.close();}
		
	catch (IOException e){System.out.print("can not find the file");}}
	}

/*You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .

Input Format

The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

Constraints

The username consists of any printable characters.
Output Format

For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
*/