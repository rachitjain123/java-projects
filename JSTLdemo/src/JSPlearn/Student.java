package JSPlearn;
public class Student {
    int rollnum;

    public Student(int rollnum, String name) {
        this.rollnum = rollnum;
        this.name = name;
    }

    public int getRollnum() {
        return rollnum;
    }

    public void setRollnum(int rollnum) {
        this.rollnum = rollnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnum=" + rollnum +
                ", name='" + name + '\'' +
                '}';
    }

    String name;
}
