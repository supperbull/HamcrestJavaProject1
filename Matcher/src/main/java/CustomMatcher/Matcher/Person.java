package CustomMatcher.Matcher;

public class Person {
  private String FirstName;
	private Integer Age;
	private boolean Age18;

	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getAge(){
		return  Age;
	}
	public void setAge(Integer age){
		Age = age;
	}
	public boolean getAge18(){
		return Age18;
	}
	public void setAge18(Integer age){
		if(age<18){Age18=false;}
		else Age18=true;
	}
}
