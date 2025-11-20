public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0); 
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

  
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficher() {
        System.out.println(  x + " ; " + y  );
    }
}
