public abstract class Thing {

    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    protected int  row, col, dir;
    protected char lab = 'r';
    
    protected void rightTurn(Thing t) {
        t.dir = (t.dir + 1) % 4;
    }

    protected void leftTurn(Thing t) {
        t.dir = (t.dir + 3) % 4;
    }

    abstract void maybeTurn(Thing t);
  
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
