
public class Student {
	
	private String name;
	private char gender;
	private Date birthdate;
	private Preference pref;
	private boolean matched;
	
	
	public Student(String name, char gender, Date birthdate, Preference pref) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.pref = pref;
	}
	
	public String getName() {
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public Date getBirthdate() {
		return birthdate;
	}
	
	public Preference getPref() {
		return pref;
	}
	
	public boolean getMatched() {
		return matched;
	}
	
	public void setMatched(boolean matched) {
		this.matched = true;
	}
	
	
	public int compare(Student st) {
		int diff = 0;
		
		if(gender != st.gender)
			return 0;
		else {
			Preference stpref = st.getPref();
			Date stdate = st.getBirthdate();
			diff += (40 - pref.compare(stpref)) + (60 - birthdate.compare(stdate));
		}
			
		return diff;
	}
	
}
