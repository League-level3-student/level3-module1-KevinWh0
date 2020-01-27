package _03_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		
		char[] chars = new char[b.length()];
		int open = 0;
		int closed = 0;
		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			chars[i] = b.charAt(i);
		}
		for (int i = 0; i < chars.length; i++) {
			
			if(chars[i] == '{') {
				open++;
			}else{
				closed++;
				if(closed > open) return false;
			}
		}
		if(open == closed) {
			return true;
		}else {
			return false;
		}
	}

}