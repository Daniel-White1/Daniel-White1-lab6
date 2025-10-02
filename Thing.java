
public abstract class Thing {
        
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    protected int  row, col, dir;

    //set red to be the default thing color
    protected char lab;

    //Constructor for the thing. It didnt let me set up the constructor to be empty like lecture 4
    //So I just set it up that the constructor sets the objects variables that can be called by the children Thing objects
    public Thing(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    //as no objects are going to change right turn it can be defined in the abstract
    protected void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    //as no objects are going to turn left it can be defined in the abstract
    protected void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    //However the maybeTurn will be changing for each object so it will be an abstract method
    abstract void maybeTurn(Thing t);

    //Finally step will remain the same so it can be defined in the abstract
    protected void step(Thing t) {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        t.row += dr[t.dir];
        t.col += dc[t.dir];
    }
}
