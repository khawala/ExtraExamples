import java.util.Scanner;

public class PairIsograms {
	/*program to check if each character in the string appears only two times*/
	public static void pairIsOrgams()
	{Scanner input=new Scanner(System.in);
	String s;boolean p=true;int count=0;
	s=input.nextLine();
	for(int i=0;i<s.length();i++)
	{p=true;
	count=0;
		for(int j=0;j<s.length();j++)
		{if(s.charAt(i)==s.charAt(j))
			count++;
		}	
		if(count!=2)
			{p=false;
		break;}
	}
	if(p==true)
	System.out.println("pair isorgams");
	else
		System.out.println("not pair isorgams ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pairIsOrgams();
		System.out.print("\b");
	}}
