import java.util.Random;

//ThingC is a diagnoal move aka zig zag thingy.
public class ThingC extends ThingB{

    public Random rand = new Random(System.currentTimeMillis());

    public ThingC (int row, int col, int dir, int timeSinceLast, char lab){
        super(row, col, dir, lab);
        this.timeSinceLast = 0;
    }

    //This maybe turn zig zags until the 6th step where it turns sets up to turn left or right
    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
        this.timeSinceLast++;

        //if the timeSinceLast is even and the time since last does not equal 6 then turn left
        if (timeSinceLast % 2 == 0 && timeSinceLast != 6) {
            leftTurn(t);
        }

        //if the timeSinceLast is odd and not equal to zero then turn right
        if (timeSinceLast % 2 != 0 && timeSinceLast != 0)
        {
            rightTurn(t);
        }

        //if the time since Last is 6 than randomly choose to contine straight or continue left or right.
        if (this.timeSinceLast == 6) {

            //restarts the process by setting timesSinceLast to zero
            this.timeSinceLast = 0;
            if (i == 1) {
                rightTurn(t);
            }
            if (i == 2) {
                leftTurn(t);
            }
        }
    }
}
