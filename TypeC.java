import java.util.Random;

//ThingC is a diagnoal move aka zig zag thingy.
public class TypeC extends TypeB{

    public Random rand = new Random(System.currentTimeMillis());

    public TypeC (int row, int col){
        super(row, col);
        lab = 'm';
        this.timeSinceLast = 0;
    }

    //This maybe turn zig zags until the 6th step where it turns sets up to turn left or right
    public void maybeTurn(Random r) {
        int i = r.nextInt(3);
        this.timeSinceLast++;

        //if the timeSinceLast is even and the time since last does not equal 6 then turn left
        if (timeSinceLast % 2 == 0 && timeSinceLast != 6) {
            this.leftTurn();
        }

        //if the timeSinceLast is odd and not equal to zero then turn right
        if (timeSinceLast % 2 != 0 && timeSinceLast != 0)
        {
            this.rightTurn();
        }

        //if the time since Last is 6 than randomly choose to contine straight or continue left or right.
        if (this.timeSinceLast == 6) {

            //restarts the process by setting timesSinceLast to zero
            this.timeSinceLast = 0;
            if (i == 1) {
                this.rightTurn();
            }
            if (i == 2) {
                this.leftTurn();
            }
        }
    }
}
