public class ThingList {

    //Thing List creates a head node and sets it to null
    Node head;

    //Constructor for an empty ThingList sets the head to null
    public ThingList(){
        head = null;
    }

    //The constructor for a ThingList that includes a head node sets the head to a node
    public ThingList(Node node){
        head = node;
    }
   
    //This code just relies on inserting each node at the end of the link so we dont have to rely on inserting the middle
    // just the head and end
    
    private void insert(Node node){
        if(this.head == null){
            this.head = node;
        }

        Node currentNode = this.head;
        if(this.head != null){
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }
}