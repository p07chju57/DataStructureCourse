package LinkedList.Course;

public class LinkedList {

    public static void main(String[]args){
        Node head=new Node(4);
        Node second=new Node(5);
        Node third=new Node(6);
        head.next=second;
        second.next=third;
        System.out.println("next after the head is "+head.next);
        System.out.println(countNode(head));
    }

    public static int countNode(Node head){
        int count=1;
        Node current=head;

        while (current.next!=null){
            current=current.next;
            count=count+1;
        }
        return count;
    }
}
