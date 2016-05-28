
public class Person {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Person(String firstName,String middleName,String lastName){
		this(firstName,lastName);
		setMiddleName(middleName);
	} 
	public Person(String firstName, String lastName) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Person(){
		
	} 
	
	public void setFirstName(String firstName){
		if(firstName.length()>=1){
			this.firstName=firstName;
		}
		
	}
	public String getFirstName(){
		return firstName;
	}
	
	

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName(){
		String fullName= firstName+" " +middleName+" "+lastName;
		return fullName;

	}
}