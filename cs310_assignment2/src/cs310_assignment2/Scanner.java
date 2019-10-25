package cs310_assignment2;

public class Scanner {
	
	final int ID = 1;
	final int BEG = 2;
	final int PROC = 3;
	final int ASSIGN = 4;
	final int INT_LIT = 5;
	final int SEM_COL = 6;
	final int END = 7;
	final int ADD = 8;
	final int SUB = 9;
	final int MULT = 10;
	final int DIV = 11;
	final int EQUAL = 12;
	final int NOT_EQUAL =13;
	final int LEFT_PAR = 14;
	final int RGHT_PAR = 15;
	final int IF = 16;
	final int THEN = 17;
	final int ELSE = 18;
	final int ENDIF = 19;
	final int ENDOFINPUT = 20;
	
	private String[] lexemes = {"identifier", "integer literal", "procedure keyword", "begin keyword", "end keyword", "semicolon operator", "assignment operator", "addition operator", "subtraction operator", "multiplication operator", "division operator", "equality operator", "notequals operator", "left parenthesis", "right parenthesis", "if keyword", "then keyword", "else keyword", "endif keyword", "ENDOFINPUT"};
	private char[] input;
	private int currTok;
	String token;
	
	public Scanner(String in)
	{
		input = new char[in.length()];
		for(int i = 0; i < in.length(); i++)
		{
			input[i] = in.charAt(i);
		}
		currTok = 0;
		token = "";
	}
	
	public int getNextToken()
	{
		currTok++;
		if(input[currTok] == BEG) return 1;
		return ADD;
		
	}
	
	public char getCurrentToken()
	{
		return input[currTok];
	}
	
	
	

	
	

}
