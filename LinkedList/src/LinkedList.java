//sorting method is a modified is at the end of the file and is called sortInsertion
public class LinkedList {
    private Node head;
    private Node tail;

    LinkedList(){
        this.head = null;
        this.tail = null;
    }

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

    public int getLength(){
        int length = 0;
        Node pointer = head;
        while(pointer != null){
            length++;
            pointer = pointer.getNextNode();
        }
        return length;
    }

    public void sortInsertion(){
        // Initialize sortedHead with the first node of the list
        Node sortedHead = head;
        head = head.getNextNode();
        sortedHead.setNextNode(null);

        // Iterate through the remaining nodes
        while(head != null){
            Node oldHead = head;
            head = head.getNextNode();

            Node pointerA = sortedHead;
            Node pointerB = pointerA.getNextNode();

            boolean stillInsterting = true;

            // Find the correct position to insert the node
            while(stillInsterting){  
                if(oldHead.getData() < pointerA.getData()){
                    // Insert at the beginning
                    oldHead.setNextNode(pointerA);
                    sortedHead = oldHead;
                    stillInsterting = false;
                }else if(pointerB == null || oldHead.getData() <= pointerB.getData()){
                    // Insert between pointerA and pointerB
                    oldHead.setNextNode(pointerB);
                    pointerA.setNextNode(oldHead);
                    stillInsterting = false;
                }else{
                    // Move pointers forward
                    pointerA = pointerA.getNextNode();
                    pointerB = pointerB.getNextNode();
                }
            }
        }
        // Update head and tail references
        head = sortedHead;
        while(tail.getNextNode() != null)
            tail = tail.getNextNode();
    }
}
