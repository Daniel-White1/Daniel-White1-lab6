public class Node {

    private Thing data;
    private Node next;

    //created 3 possible constructors
    public Node(){
        this.data = null;
        this.next = null;   
    }
    public Node(Thing t) {
        this.data = t;
        this.next = null;
    }

    public Node(Thing t, Node n){
        this.data = t;
        this.next = n;
    }
    public Thing getData(){
        return this.data;
    }

    public void setData(Thing thing){
        this.data = thing;
    }

    public int getRow(){
        return this.data.row;
    }

    public void setRow(int row){
        this.data.row = row;
    }

    public int getCol(){
        return this.data.row;
    }

    public void setCol(int col){
        this.data.col = col;
    }

    public char getLab(){
        return this.data.lab;
    }

    public void setLab(char lab){
        this.data.lab = lab;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext (Node curNode, Node nextNode){
        curNode.next = nextNode;
    }
}