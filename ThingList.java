public class ThingList {

    private class Node{
        Thing data;
        Node next;

        Node(Thing data){
            this.data = data;
            this.next = null;
        }


    }

    //Thing List creates a head node and a tail node
    Node head;
    Node tail;

    //Constructor for an empty ThingList sets the head to null
    public ThingList(){
        head = null;
        tail = null;
    }
    //This code just relies on inserting each node at the end of the link so we dont have to rely on inserting the middle
    // just at the head and tail of the list
    public void addThing (Thing thing){
        Node newNode = new Node(thing);

        if (head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void printAll(){
        for( Node T = head; T.next != null; T = T.next){
            Thing curThing = T.data;
            System.out.println(curThing.row + " " + curThing.col + " " + curThing.lab);
        }
      System.out.println("done");
      System.out.flush();
    }

    public void moveAll(){
        for( Node T = head; T.next != null; T = T.next) {
            Thing curData = T.data;
            curData.maybeTurn(curData.rand);
            curData.step();
        }
    }
}