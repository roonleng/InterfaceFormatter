import java.util.Scanner;

public class DecimalFormatter implements NumberFormatter
{
	Scanner in = new Scanner(System.in);
	public String format(int n)
	{
		System.out.println("Enter a number you want formatted");
		String input = in.nextLine();
		int stringLength= input.length();
		int modCommas= stringLength%3;
		int intInput=Integer.parseInt(input);
		int commaNumbers= intInput/3;
		System.out.print(commaNumbers);
		int newLength=stringLength+commaNumbers;
		char[] charArray= new char[newLength];
		if (input.length()>=4)
		{
			//for numbers like 100,000 or 100,000,000
			if (modCommas==0)
			{
				for (int i=0; i<input.length(); i+=3)
				{
					input.getChars(i, i+2, charArray, 0);
					charArray[i+3] = '.';
				}
				String newString = new String(charArray);
				return  newString;
			}
			//for numbers like 1,000 or 1,000,000
			else if (modCommas==1)
			{
				for (int i=1; i<input.length(); i+=3)
				{
					input.getChars(i, i+2, charArray, 0);
					charArray[i+3] = '.';
				}
				String newString = new String(charArray);
				return  newString;
			}
			//for numbers like 10,000 or 10,000,000
			else if (modCommas==2)
			{
				for (int i=2; i<input.length(); i+=3)
				{
					input.getChars(i, i+2, charArray, 0);
					charArray[i+3] = '.';
				}
				String newString = new String(charArray);
				return  newString;
			}
		}
		else
		{
			return input;
		}
	}
}
