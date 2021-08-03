public class SingleLinkedList {
    public static void main(String[] args) {
        System.out.println("------EMPLOYEE-----");
        System.out.println("============================");

        Student student1 = new Student("Famche","MaChe", 1);
        Student student2 = new Student("Laviki","Viki", 2);
        Student student3 = new Student("Chebo","ShaFr", 3);
        Student student4 = new Student("MeBo","CheCo", 4);


        StudentLinkedList linkedList = new StudentLinkedList();
        linkedList.addToFront(student1);
        linkedList.addToFront(student2);
        linkedList.addToFront(student3);
        linkedList.addToFront(student4);

        System.out.println("********BEFORE PRINTING******");
        linkedList.printList();
        System.out.println("********AFTER PRINTING******");



    }
}
