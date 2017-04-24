package CustomMatcher.Matcher;

import static org.hamcrest.MatcherAssert.*;
import static CustomMatcher.Matcher.PersonMatcher.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonMatcherTest {
	
	Person test;

	@Before
	public void setUp() throws Exception {
		test = new Person();
	}

	@After
	public void tearDown() throws Exception {
		test = null;
	}

	@Test
	public void testMatcherCorrect() {
		test.setFirstName("Justin");
		assertThat(test,hasFirstName("Justin"));
	}
	
	@Test
	public void testMatcherInCorrect() {
		test.setFirstName("Justin");
		assertThat(test,hasFirstName("Justin Bieber"));
	}

	//------------------------------------------------
	@Test
	public void testHasAge(){
		test.setAge(17);
		assertThat(test,hasAge(17));
	}
	@Test
	public void testHasFalseAge(){
		test.setAge(18);
		assertThat(test,hasAge(19));
	}


	//-------------------------------------------------
	@Test
	public void testHasPlus18(){
		test.setAge18(21);
		assertThat(test,hasAgeMoreThan18(21));
	}
	@Test
	public void testHasNotPlus18(){
		test.setAge18(16);
		assertThat(test,hasAgeMoreThan18(16));
	}
}
