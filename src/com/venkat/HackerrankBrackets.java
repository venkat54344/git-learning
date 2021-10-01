package com.venkat;

import java.util.Scanner;
import java.util.Stack;

public class HackerrankBrackets {

	public static String[] verify(String[] input) {
		String[] output = new String[input.length];
		int length = 0;
		for (String s : input) {
			//System.out.println(length);
			char[] ch = s.toCharArray();
			System.out.println(ch);
			Stack<Character> ss = new Stack<>();
			for (char c : ch) {

				if (c == '{' || c == '[' || c == '(') {
					ss.push(c);
					//System.out.println("pushed elements---" + ss);
				} else {
					if (c == '}' && !ss.isEmpty() && ss.peek() == '{') {
						ss.pop();
						continue;
					} else if (c == ']' && !ss.isEmpty() && ss.peek() == '[') {
						ss.pop();
						continue;
					} else if (c == ')' && !ss.isEmpty() && ss.peek() == '(') {
						ss.pop();
						continue;
					} else {
						output[length] = "NO";
						break;
					}
				}
			}

			//System.out.println("elemetns " + ss);
			if (ss.isEmpty()) {
				output[length] = "YES";
			} else {
				output[length] = "NO";
			}
			length++;
		}
		return output;
	}

	public static void main(String[] args) {

		System.out.println("hiii");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size of braces");
		int bracelength = sc.nextInt();
		String braces[] = new String[bracelength];
		for (int i = 0; i < bracelength; i++) {
			braces[i] = sc.next();
		}

		//String[] braces = { "{{}}", "{}[]" };

		String[] b = verify(braces);

		System.out.println(b[0] + "--and--" + b[1]);
	}

}
