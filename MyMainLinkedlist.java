public class MyMainLinkedlist {
    public static void main(String[] args) {
        System.out.println("******Beginning of the main method*********");
        //MyLinkedlist //;
        MyLinkedlist myLinkedlist = new MyLinkedlist();
        myLinkedlist.addData(6);
        myLinkedlist.addData(45);
        myLinkedlist.addData(8);
        myLinkedlist.addData(42);
        myLinkedlist.showList();
        myLinkedlist.addStart(86);
    //    myLinkedlist.addAnyLocation(2,66);
        myLinkedlist.showList();
        myLinkedlist.deleteNode(3);
        myLinkedlist.showList();




    }
}
