public class Stack {
    private Node top;

    public Stack(){
        this.top = null;
    }
    public Stack(Node top){
        this.top = top;
    }

    public void push(Node newNode){
        newNode.setNext(top);
        top = newNode;
    }

    public Node pop(){
        if(top == null)
            return null;
        Node poppedNode = top;
        top = top.getNext();
        return poppedNode;
    }
    public Node peek(){
        return top;
    }
}
