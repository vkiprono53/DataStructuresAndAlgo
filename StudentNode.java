public class StudentNode {
    private Student student;
    private StudentNode next;

    public StudentNode(Student student, StudentNode studentNode) {
        this.student = student;
        this.next = studentNode;
    }

    public StudentNode(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentNode getNext() {
        return next;
    }

    public void setNext(StudentNode studentNode) {
        this.next = studentNode;
    }

    @Override
    public String toString() {
        return student.toString();
  }
}
