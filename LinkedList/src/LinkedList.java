public class LinkedList {
    private Node head;
    private Node tail;

    LinkedList(Node head){
        this.head = head;
        this.tail = head;
    }

    LinkedList(int data){
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        tail.setNextNode(newNode);
        while (tail.getNextNode() != null)
            tail = tail.getNextNode();
    }

    public  void addNode(Node newNode){
        tail.setNextNode(newNode);
        while(tail.getNextNode() != null)
            tail = tail.getNextNode();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void sortInsertion(){
        Node sortedHead = null;
        Node current = head;

        while (current != null){
            Node pointerA = sortedHead;
            Node next = sortedHead.getNextNode();
            if(pointerA == null || pointerA.getData() <= current.getData()){
                current.setNextNode(sortedHead);
                sortedHead = current;
            }else if (pointerA.getData() > current.getData()){
                pointerA = pointerA.getNextNode();
            }
        }
    }
}
