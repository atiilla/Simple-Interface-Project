package com.theButton;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassGen implements Pushable {

	private String str;
	private int randInt;
	private StringBuilder sb;
	private List<Integer> l;

	public PassGen() {
		this.l = new ArrayList<>();
		this.sb = new StringBuilder();

		buildPassword();
	}
	
	public void push() {
		
		System.out.println(generatePassword()+ "\t");
		
	}

	private void buildPassword() {

		// Add ASCII numbers of characters commonly acceptable in passwords
		for (int i = 33; i < 127; i++) {
			l.add(i);
		}

		// Remove characters /, \, and " as they're not commonly accepted
		l.remove(new Integer(34));
		l.remove(new Integer(47));
		l.remove(new Integer(92));

		/*
		 * Randomise over the ASCII numbers and append respective character values into
		 * a StringBuilder
		 */
		for (int i = 0; i < 10; i++) {
			randInt = l.get(new SecureRandom().nextInt(91));
			sb.append((char) randInt);
		}

		str = sb.toString();
	}

	public String generatePassword() {
		return str;
	}
}
