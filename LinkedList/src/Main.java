public class Main {

    public static void main(String[] args) {
        LinkedList firstLinkedList = new LinkedList(10);
        firstLinkedList.addNode(20);
        firstLinkedList.addNode(30);
        firstLinkedList.addNode(40);

        LinkedList secondLinkedList = new LinkedList(50);
        secondLinkedList.addNode(firstLinkedList.getHead());
        for(int i = 0; i < 100; i++)
            secondLinkedList.addNode((int)(Math.random() * 100));

        secondLinkedList.sortInsertion();
        Node pointerA = secondLinkedList.getHead();
        
        while(pointerA != null){
            System.out.println(pointerA.getData());
            pointerA = pointerA.getNextNode();
        }
    }
}