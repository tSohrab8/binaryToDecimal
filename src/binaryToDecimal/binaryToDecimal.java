package binaryToDecimal;

import java.util.*;
import java.lang.Math;

public class binaryToDecimal {
	
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		String binary = scan.next();
		int decimal = 0;                            // holds final decimal value
		int len = binary.length() - 1;              //length of binary string - 1
		
		//iterate through reverse order, apply proper exponentials per binary digit, sum accordingly
		for (int i = len ; i >= 0; i--){
			if (binary.charAt(i) == '1'){
				decimal = decimal + (int)Math.pow(2, len - i);
			}
		}
		
		System.out.println(decimal);

	}
}
