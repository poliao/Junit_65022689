import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuizOneJunitTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSquare() {
		QuizOneJunit quiz = new QuizOneJunit();
		
		assertEquals(25, quiz.square(5));
		assertEquals(16, quiz.square(-4));
		assertEquals(0, quiz.square(0));
	}

	@Test
	public void testCountLetterA() {
		QuizOneJunit quiz = new QuizOneJunit();
		
		assertEquals(2, quiz.countLetterA("Apple"));
		assertEquals(3, quiz.countLetterA("Banana"));
		assertEquals(0, quiz.countLetterA("Orange"));
	}

	@Test
	public void testCheckTwoLetter() {
		QuizOneJunit quiz = new QuizOneJunit();
		
		assertTrue(quiz.checkTwoLetter("abab"));
		assertTrue(quiz.checkTwoLetter("xyxy"));
		assertFalse(quiz.checkTwoLetter("a"));
		assertFalse(quiz.checkTwoLetter("xyz"));
		assertFalse(quiz.checkTwoLetter(""));
	}
}


