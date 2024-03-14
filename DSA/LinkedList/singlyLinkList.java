package DSA.LinkedList;

public class singlyLinkList {

    private Node head;
    private Node tail;

    private int size;

    public singlyLinkList(){
        this.size =0;
    }

    public void insertLast(int value){

        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insertFirst(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }
        size +=1;
       

        
    }

    public void insert(int value ,int index){
        if(index==0){
            insertFirst(value);

        }
        if(index==size){
            insertLast(value);
        }

        Node cur = head;

        for(int i=1;i<index;i++){
            cur = cur.next;
        }

        Node node = new Node(value,cur.next);

        cur.next = node;

        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("No value to print");
        }
        Node cur = head;

        while(cur != null){
            System.out.print(cur.value+"->");
            cur = cur.next;
        }

        System.out.println("null");

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public int deleteFirst(){

        int val = head.value;
        head = head.next;

        if(head==null){
            tail=null;
        }
        size--;
        return val;

    }

    public int deleteLast(){

        if(size<=1){
            deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;

        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public int delete(int index){
        if(index==0){
            deleteFirst();

        }
        if(index==size){
            deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;  //value of next node from current address

        prev.next = prev.next.next;

        return val;
        

    }



    public static void main(String[] args) {
        singlyLinkList list = new singlyLinkList();

        list.insertLast(0);
        list.insertLast(1);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(99);
        list.insert(100, 5);

        list.display();

        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        System.out.println(list.delete(1));
        list.display();
    }


    
}
