package devops.numbers;
import java.util.*;
import java.io.IOException;
public class NumberWordsApplication 
{
	private final NumberWords numberWords ;
	private final Scanner in;
	
	public NumberWordsApplication() 
	{
		numberWords = new NumberWords() ;
		in = new Scanner(System.in) ;
	}
	
	public void execute() throws IOException 
	{
		while( true ) 
		{
			try
			{
				System.out.print( "Enter number (0 to exit): " ) ;
				int number = in.nextInt();
				if(number == 0)
				{
					System.exit(1);
				}
				String stringValue = numberWords.toWords(number);
				System.out.println(stringValue);
			} 
			catch ( NumberFormatException e ) 
			{
				System.out.println( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) throws IOException 
	{
		new NumberWordsApplication().execute() ;
		System.out.println( "Executed" ) ;

	}
}
