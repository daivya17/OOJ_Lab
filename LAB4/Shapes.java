abstract class Shapes{
    int dim1;
    int dim2;
    Shapes(int dim1,int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract void getArea();
}
class Rectangles extends Shapes{
    Rectangles(int len,int br){
        super(len,br);
    }
    @Override
    public void getArea(){
        int area = dim1*dim2;
        System.out.println("area of rectangle:"+area);
    }
}
class Triangles extends Shapes{
    Triangles(int base,int height){
        super(base,height);
    }
    @Override
    public void getArea(){
        double area = 0.5*dim1*dim2;
        System.out.println("area of triangle:"+area);
    }
}
class Circles extends Shapes{
    Circles(int r){
        super(r,0);
    }
    @Override
    public void getArea(){
        double area = Math.PI*dim1*dim1;
        System.out.println("area of circle:"+area);
    }
}
public class Shapesabs {
    public static void main(String[] args){
        Rectangles r = new Rectangles(4,5);
        Triangles t = new Triangles(10,20);
        Circles c = new Circles(10);
        r.getArea();
        t.getArea();
        c.getArea();
        System.out.println("Daivya Priyankkumar Shah");
        System.out.println("1BM23CS084");
    }
}
