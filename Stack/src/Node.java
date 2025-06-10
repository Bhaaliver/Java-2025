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
    public void setNext(Node newNext){
        this.nextNode = newNext;
    }
    public Node getNext(){
        return this.nextNode;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int newValue){
        this.value = newValue;
    }
}