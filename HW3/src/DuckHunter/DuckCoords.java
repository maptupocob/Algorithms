package DuckHunter;

public class DuckCoords implements Comparable<DuckCoords> {
    private final int x;
    private final int y;
    private float angle;

    public DuckCoords(int x, int y) {
        this.x = x;
        this.y = y;
        angle = (float) Math.atan2(y, x);
        if (angle < 0) {
            angle = (float) (2 * Math.PI + angle);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return Math.abs(this.angle - ((DuckCoords) obj).angle) < 1e-4;
    }

    @Override
    public String toString() {
        return String.format("Duck has %.3f angle and coords: x = %d, y = %d", angle, x, y);
    }

    public float getAngle() {
        return angle;
    }

    @Override
    public int compareTo(DuckCoords o) {
        if (this.equals(o)) return 0;
        else if(this.angle > o.getAngle()){
            return 1;
        }else {
            return -1;
        }
    }
}
