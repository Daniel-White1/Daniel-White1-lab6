import java.util.Random;

public class TypeA extends Thing {

    public TypeA (int row, int col){
        super(row, col);
        lab = 'r';
    }

    public void maybeTurn(Random r) {
        int i = r.nextInt(3);
        if (i == 1) {
            this.rightTurn();
        }

        if (i == 2) {
           this.leftTurn();
        }
    }
}
