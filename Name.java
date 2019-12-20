package day14;

class Name {
	String firstName;
	String lastName;

	Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean equals(Object o) { //equals 메서드의 헤더는 반드시 이렇게 정의되어야함

		boolean result = false;
		if(o!=null && o instanceof Name ) {
			Name obj = (Name)o;
			if(firstName.equals(obj.firstName)
				&&lastName.equals(obj.lastName)) {
				
				result =  true;
			}
		}
		return result;
	}
	
	public int hashcode() {
			return firstName.hashCode()+lastName.hashCode();
		}
		
	public String toString() {
		return "[" + firstName + lastName + "]";
	}
	
	
}
