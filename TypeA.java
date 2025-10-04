import java.util.Random;

public class TypeA extends Thing {

    public Random rand = new Random(System.currentTimeMillis());

    public TypeA (int row, int col){
        super(row, col);
        lab = 'r';
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
