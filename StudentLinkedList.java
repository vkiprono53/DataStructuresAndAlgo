public class StudentLinkedList {
    private StudentNode head;

    public void addToFront(Student student) {
        StudentNode studentNode = new StudentNode(student);
        studentNode.setNext(studentNode);
        head = studentNode;
    }

    public void printList() {
        StudentNode current = head;

        System.out.println("HEAD - > ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" - > ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
