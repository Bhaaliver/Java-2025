public class Node{
    private int value;
    private Node nextNode;
    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }
    public Node(int value, Node NextNode){
        this.value = value;
        this.nextNode = NextNode;
    }
}