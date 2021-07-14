package com.pluralsight.democonferencedemo.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PalindromeServiceTest {
	
	@Autowired
	PalindromeService palindromeService = new PalindromeService();
	
	@Test
	public void whenEmptyString_thenAccept() {
	    assertTrue(palindromeService.isPalindrome(""));
	}

}
