import java.util.Random;

public abstract class Thing {
        
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    protected int row;
    protected int col;
    protected int dir;
    protected char lab;

    //Constructor for the thing. It didnt let me set up the constructor to be empty like lecture 4
    //So I just set it up that the constructor sets the objects variables that can be called by the children Thing objects
    public Thing(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    //as no objects are going to change right turn it can be defined in the abstract
    public void rightTurn() {
        this.dir = (this.dir + 1) % 4;
    }

    //as no objects are going to turn left it can be defined in the abstract
    public void leftTurn() {
        this.dir = (this.dir + 3) % 4;
    }

    //However the maybeTurn will be changing for each object so it will be an abstract method
    public abstract void maybeTurn(Random rand);

    //Finally step will remain the same so it can be defined in the abstract
    public void step() {
        final int[] dc = {
            0, 1, 0, -1
        }, dr = {
            1, 0, -1, 0
        };
        this.row += dr[this.dir];
        this.col += dc[this.dir];
    }
}
