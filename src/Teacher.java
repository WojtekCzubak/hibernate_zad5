import java.util.HashSet;
import java.util.Set;

public class Teacher {

		private long id;
		private String name;
		private String surname;
		private String pesel;
		
		private Set<SchoolClass> schoolClasses = new HashSet<SchoolClass>();
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public Teacher() {
			
		}
		
		//SchoolClass methods
		public Set<SchoolClass> getSchoolClass() {
			return schoolClasses;
		}

		public void setSchoolClass(Set<SchoolClass> schoolClasses) {
			this.schoolClasses = schoolClasses;
		}
		
		public void addSchoolClass(SchoolClass newSchoolClass) {
			schoolClasses.add(newSchoolClass);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public String getPesel() {
			return pesel;
		}

		public void setPesel(String pesel) {
			this.pesel = pesel;
		}
		
	}


