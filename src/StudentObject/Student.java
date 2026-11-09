
package StudentObject;

public class Student {

    int student_id;
    String student_name;
    int student_age;
    String course;

    public Student(int student_id, String student_name,
                   int student_age, String course) {

        this.student_id = student_id;
        this.student_name = student_name;
        this.student_age = student_age;
        this.course = course;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "student_id='" + student_id +
                "', student_name='" + student_name + '\'' +
                ", student_age=" + student_age +
                ", course='" + course + '\'';
    }
}
