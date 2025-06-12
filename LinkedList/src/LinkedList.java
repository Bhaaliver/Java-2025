// LinkedList class implements a singly linked list with insertion sort
public class LinkedList {
    // Head node of the list
    private Node head;
    // Tail node of the list
    private Node tail;

    // Default constructor initializes an empty list
    LinkedList(){
        this.head = null;
        this.tail = null;
    }

    // Constructor initializes the list with a given head node
    LinkedList(Node head){
        this.head = head;
        this.tail = head;
    }

    // Constructor initializes the list with a single integer data node
    LinkedList(int data){
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
    }

    // Adds a new node with the given data to the end of the list
    public void addNode(int data){
        if (head == null) {
            head = new Node(data);
            tail = head;
            return;
        }
        Node newNode = new Node(data);
        tail.setNextNode(newNode);
        // Move tail to the new last node
        while (tail.getNextNode() != null)
            tail = tail.getNextNode();
    }

    // Adds an existing node to the end of the list
    public  void addNode(Node newNode){
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNextNode(newNode);
        // Move tail to the new last node
        while(tail.getNextNode() != null)
            tail = tail.getNextNode();
    }

    // Inserts a node after a given parent node
    public void addNode(Node newNode, Node newParent){
        Node oldChild = newParent.getNextNode();
        if (oldChild == null){
            addNode(newNode);
        }
        newNode.setNextNode(oldChild);
        newParent.setNextNode(newNode);
    }

    // Returns the head node of the list
    public Node getHead() {
        return head;
    }

    // Returns the tail node of the list
    public Node getTail(){
        return tail;
    }

    // Returns the length of the list
    public int getLength(){
        int length = 0;
        Node pointer = head;
        // Traverse the list and count nodes
        while(pointer != null){
            length++;
            pointer = pointer.getNextNode();
        }
        return length;
    }

    // Sorts the linked list using insertion sort algorithm
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
        // Update head to the new sorted head
        head = sortedHead;
        // Update tail to the last node
        while(tail.getNextNode() != null)
            tail = tail.getNextNode();
    }
}
