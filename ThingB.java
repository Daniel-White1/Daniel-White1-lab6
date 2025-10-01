import java.util.Random;

public class ThingB extends Thing {
    
    public Random rand = new Random(System.currentTimeMillis());
    protected int timeSinceLast = 0;

    public ThingB (int row, int col, int dir, char lab){
        super(row, col, dir, lab);
    }

    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
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
