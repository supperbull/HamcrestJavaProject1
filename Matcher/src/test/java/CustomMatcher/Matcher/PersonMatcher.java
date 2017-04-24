package CustomMatcher.Matcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class PersonMatcher {
	public static Matcher<Person> hasFirstName(final String name){
		return new TypeSafeMatcher<Person>(){

			public void describeTo(final Description description) {
				description.appendText("expected result from getFirstName(): ").appendValue(name);
			}

			@Override
			public boolean matchesSafely(Person person) {
				return name.equals(person.getFirstName());
			}

			public void describeMismatchSafely(final Person person, final Description mismatchDescription) {
				mismatchDescription.appendText("was ").appendValue(person.getFirstName());
			}
		};
	}

	public static Matcher<Person> hasAge(final Integer age){
		return new TypeSafeMatcher<Person>(){

			public void describeTo(final Description description) {
				description.appendText("expected result from getAge(): ").appendValue(age);
			}

			@Override
			public boolean matchesSafely(Person person) {
				return age.equals(person.getAge());
			}

			public void describeMismatchSafely(final Person person, final Description mismatchDescription) {
				mismatchDescription.appendText("was ").appendValue(person.getAge());
			}
		};
	}

	public static Matcher<Person> hasAgeMoreThan18(final Integer age){
		return new TypeSafeMatcher<Person>(){

			public void describeTo(final Description description) {
				description.appendText("expected result from getAge18() is: true");
			}

			@Override
			public boolean matchesSafely(Person person) {
				if(age<18){
					return false;
				}else{
					return true;
				}
			}

			public void describeMismatchSafely(final Person person, final Description mismatchDescription) {
				mismatchDescription.appendText("was ").appendValue(person.getAge18());
			}
		};
	}
}
