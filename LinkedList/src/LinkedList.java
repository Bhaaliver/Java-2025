//sorting method is a modified is at the end of the file and is called sortInsertion
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

    public void addNode(Node newNode, Node newParent){
        Node oldChild = newParent.getNextNode();
        if (oldChild == null){
            addNode(newNode);
        }
        newNode.setNextNode(oldChild);
        newParent.setNextNode(newNode);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public void sortInsertion(){
        Node sortedHead = head;
        head = head.getNextNode();
        sortedHead.setNextNode(null);

        while(head != null){
            Node oldHead = head;
            head = head.getNextNode();

            Node pointerA = sortedHead;
            Node pointerB = pointerA.getNextNode();

            boolean stillInsterting = true;
            while(stillInsterting){  
                if(oldHead.getData() < pointerA.getData()){
                    oldHead.setNextNode(pointerA);
                    sortedHead = oldHead;
                    stillInsterting = false;
                }else if(pointerB == null || oldHead.getData() <= pointerB.getData()){
                    oldHead.setNextNode(pointerB);
                    pointerA.setNextNode(oldHead);
                    stillInsterting = false;
                }else{
                    pointerA = pointerA.getNextNode();
                    pointerB = pointerB.getNextNode();
                }
            }
        }
        head = sortedHead;
    }
}
