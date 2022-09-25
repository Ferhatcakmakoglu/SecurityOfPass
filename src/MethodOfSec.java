
public class MethodOfSec {
	public char method(char x) {
		int asciiValue = x;
		char newChar;
		
		if(asciiValue >= 65 && asciiValue <= 90)
			asciiValue -= 32;
		else if(asciiValue >= 97 && asciiValue <= 122)
			asciiValue -= 12;
		else if(asciiValue >= 32 && asciiValue <= 64)
			asciiValue += 16;
		else 
			asciiValue -= 10;
		newChar = (char)asciiValue;
		return newChar;
	}
}
