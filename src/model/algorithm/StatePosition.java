package model.algorithm;

public class StatePosition {

    private final int state;
    private final int x;
    private final int y;


    public StatePosition(int state, int x, int y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    public StatePosition(int x, int y) {
        this.state = 0;
        this.x = x;
        this.y = y;
    }

    public int state() {
        return state;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
}
