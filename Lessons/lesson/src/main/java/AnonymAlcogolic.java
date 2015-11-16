import java.util.HashSet;
import java.util.Set;

class AnonymAlcogolic {
   private   String name;
    private Set<Student> a= new HashSet<>();
    class Student{
        String firstname;
        String lastname;

        public Student(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    '}';
        }
    }
    public void add(Student d){
        a.add(d);
    }
}
