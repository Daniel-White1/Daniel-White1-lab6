import java.util.Random;

public class ThingA extends Thing {

    public Random rand = new Random(System.currentTimeMillis());

    public ThingA (int row, int col, int dir, char lab){
        super(row, col, dir, lab);
    }

    public void maybeTurn(Thing t) {
        int i = rand.nextInt(3);
        if (i == 1) {
            rightTurn(t);
        }

        if (i == 2) {
            leftTurn(t);
        }
    }
}
