public class ThingList {

    //Thing List creates a head node and sets it to null
    Node head;
    Node tail;

    //Constructor for an empty ThingList sets the head to null
    public ThingList(){
        head = null;
        tail = null;
    }

    //The constructor for a ThingList that includes a head node sets the head to a node as well as a tail because I dont want
    //the time efficiency to go down with a long list
    public ThingList(Node node){
        head = node;
        tail = node;
    }
   
    //This code just relies on inserting each node at the end of the link so we dont have to rely on inserting the middle
    // just at the head and tail of the list
    public void addLast (Node node){
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }

        if (this.head != null) {
            this.tail.setNext(this.tail, node);
            this.tail = node;
        }
    }

    public void printAll(){
        for( Node T = head; T.getNext() != null; T = T.getNext() ){
            System.out.println(T.getRow() + " " + T.getCol() + " " + T.getLab());
        }
      System.out.println("done");
      System.out.flush();
    }

    public void moveAll(){
        for( Node T = head; T.getNext() != null; T = T.getNext() ) {
            maybeTurn(T.getData());
            step(T.getData());
        }
    }
}