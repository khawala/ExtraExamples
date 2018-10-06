import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Tokenizer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File in=null;
		Scanner input=null;
		try {
			in= new File("stringtokenizer.txt");
			input=new Scanner(in);
				int count = 0;
				
				
				while (input.hasNextLine()){
					String word =input.nextLine();
					System.out.println(word);
				count++;
System.out.print("line n "+count +"------->");
StringTokenizer st = new StringTokenizer(word, "!- ,");
				System.out.println(st.countTokens()+" words");
				while(st.hasMoreTokens()){
				String string = st.nextToken();
				System.out.println("-"+string+"("+string.length()+" characters)"); 
				}
				}
				input.close();

			}
		catch (IOException e)
		{
			System.out.print("can not find the file");
		}

	}

}
