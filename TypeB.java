import java.util.Random;

public class TypeB extends Thing {
    
    protected int timeSinceLast = 0;

    public TypeB (int row, int col){
        super(row, col);
        lab = 'b';
    }

    public void maybeTurn(Random r) {
        int i = r.nextInt(3);
        this.timeSinceLast++;

        if (this.timeSinceLast == 10) {
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
