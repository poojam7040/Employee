import java.util.HashMap;

import java.util.HashMap;

import java.util.HashMap;

import java.util.HashMap;

public class PracticePrograms {

	public static void  checkPrimeNumber(int num) {

		for(int i = 2; i <= num/2 ; i ++ ) {

			if(num % i == 0) {
				System.out.println("Number is not prime");
				break;
			}
			if(i == num/2) {
				System.out.println("Prime Number");
			}

		}

	}

	public static void checkPalindrome(String str) {

		if(new StringBuffer(str).reverse().toString().equals(str)) {
			System.out.println("String Is palindrome");
			return;
		}

		System.out.println("String is not palindrome");
	}

	public static void findCountOfSubString(String original, String subStr) {
		int count = 0;
		try {
			for(int i = 0 , j = 0; i< original.length();) {

				if(original.charAt(i)!= subStr.charAt(j)) {

					i++;
				}
				if(original.charAt(i)==subStr.charAt(j) && original.substring(i, i+subStr.length()).equals(subStr)) {
					i+=subStr.length();
					count++;
				}else {
					i++;
				}

			}
		}catch(StringIndexOutOfBoundsException e) {

			System.out.println(e);
		}
		
		System.out.println(count);



	}
	
	public static void countOfWord(String str[]) {
		HashMap<String, Integer> countOfWord = new HashMap();
		
		for(int i = 0; i < str.length ; i++ )
		{
		   if(countOfWord.containsKey(str[i])) {
			   countOfWord.put(str[i], countOfWord.get(str[i])+1);
		   }else {
			   countOfWord.put(str[i], 1);		   }
		}
		
		System.out.println(countOfWord);
	}

	
	public static void findDuplicateFromArray() {
		
		int arr[] = {10,20,34,22,10};
		String s = "";
		for(int i = 0 ; i < arr.length ; i++) {
			s += String.valueOf(arr[i]);
		}
		
		System.out.println(s);
		
		for(int i = 0 ; i < arr.length ; i++) {
			
		  String len = s.replaceAll("[^"+String.valueOf(arr[i]).length()+"]", "");
		  
		  System.out.println(len);
		}
		
	}
	
	public static void getCountOfEachChar() {
		char name[]= "Poojaa".toCharArray();
		HashMap<Character, Integer> count = new HashMap();
		
		for(int i = 0; i<name.length; i++) {
			
			if(count.containsKey(name[i])) {
				count.put(name[i], count.get(name[i])+1);
				System.out.println(1);
			}else {
				count.put(name[i], 1);
			}
			
			
		}
		
		
		System.out.println(count);
	}
	
	
	public static void getDuplicateCharLength() {
		String str = "Poojaiophggjiophggiopbiopiophhjio";
		String con = "";
		System.out.println(str.replaceAll("iop", "@").replaceAll("[^@]", "").length());
	}
	
	public static void swapNumberWithoutThirdVariable(int a, int b) {
		//a = 10 b = 20
		a = a + b ;
		b = a - b;
		a = a - b ;
		
		System.out.println(" A ::"+a + "B :::;" +b);
		
	}
	
	public static void isArmstrong(int num) {
	
		int count = getCountOfDigits(num);
		int num1 = num;
		int sum = 0;
		int prod = 1;
		
		for(int i =  num ; num != 0 ; num /= 10) {
			
			int rem = num % 10 ;
		    int c = count;
			
			while(c > 0) {
				
				prod *= rem ; 
						
				c -- ;
			}
			
			
			sum += prod;
			prod = 1;
		}
		
		if(num1 == sum) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
	}
	
	public static int getCountOfDigits(int num) {
		 int count = 0 ;
		 
		 while(num != 0) {
			 count++;
			 num /= 10;
		 }
		return count ;
	}
	
	public static void buzzNumber(int num) {
		
		//if num is ends with 7 or divisible by 7

		if(num % 10 == 7 || num % 7 == 0) {
			System.out.println("Number is Buzz");
		}else {
			System.out.println("Number is not Buzz");
		}
		
	}
	
	public static void isAutomorphic(int num) {
		int c = getCountOfDigits(num);
		int prod = 1; 
		for(int i = 0 ; i < c ; i++) {
			prod *= 10;
		}
		System.out.println(prod);
		System.out.println(num*num);
		System.out.println(num%prod);
		if(((num*num)%prod) == num) {
			System.out.println("Number is Automorphic!!!!!!!!!!");
		}else {
			System.out.println("Number is not automorphic!!!!");
		}
	}
	public static void main(String[] args) {


//		checkPrimeNumber(11);
//		checkPalindrome("mam");
//		findCountOfSubString("xdyiophjukiophjhsiopghgiop", "iop");
//		String []str= {"Pooja", "Neha","Pooja", "Bhumi", "Pooja"};
//		countOfWord(str);
//		findDuplicateFromArray();
//		getCountOfEachChar();
//		getDuplicateCharLength();

		swapNumberWithoutThirdVariable(15,20);
		
		isArmstrong(153);
		
		buzzNumber(4897);
		
		isAutomorphic(6);
		
		System.out.println("I am pooja and ia have made changes in this file");
	}

}
