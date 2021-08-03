public class MyLinkedlist {
    MyNode head;

    public void addData(int data) {
        System.out.println("-----Adding new node-----");

        // Create a new Node:
        MyNode myNode = new MyNode(data);

        if (head == null) {
            head = myNode;
        } else {
            MyNode currNode = head; //assigning temporal value to the head
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(myNode);
        }
        System.out.println("-----Exit addData-----");
    }

    public void addStart(int data) {
        System.out.println("-----Beginning to add the node at the start-------");
        MyNode newNode = new MyNode(data); //New node
        newNode.setNext(head);
        head = newNode;
    }

    public void showList() {
        System.out.println("-------printing the list----");

        MyNode myNode = head;
        while (myNode != null) {
            System.out.print(myNode.getData() + " --> ");
            myNode = myNode.getNext(); // Shifting to the next node
        }
        System.out.println("null");
    }

    public void addAnyLocation(int index, int data) {
        System.out.println("--------Beginning to add at any location----------");
        MyNode node = new MyNode(data); //New node
        MyNode temp = head;
        if (index == 0) {
            addStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void deleteNode(int key) {
        System.out.println("-----Beginning to deleteNode-----");
        MyNode prevNode = null;
        MyNode temp = head;

        if (key == 0){
            head = head.getNext();
        }
        else {
            for (int i = 0; i < key-1;i++){
                temp = temp.getNext();
            }
            prevNode = temp.getNext();
            temp.setNext(prevNode.getNext());
            System.out.println("Deleted item here is : " + temp.getData());
        }
        /*while (temp != null && temp.getData() != key) {
            prevNode = temp;
            temp = temp.getNext();
        }
        if (temp == null){
            return;
        }
        prevNode = temp.getNext();
*/
    }
}
