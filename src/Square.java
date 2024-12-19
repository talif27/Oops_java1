class Square1{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
    public int diagonal_square() {
        return 2 * (side * side);
    }
}
public class Square {
    public static void main(String[] args) {
        Square1 sq= new Square1();
        sq.side =4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(sq.diagonal_square());
    }
}
