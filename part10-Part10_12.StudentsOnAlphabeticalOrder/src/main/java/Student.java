

public class Student implements Comparable <Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public int compareTo(Student student){
        if (this.name.equals(student.name)){
            return 0;
        } else return (this.name.compareToIgnoreCase(student.name));
    }
}
