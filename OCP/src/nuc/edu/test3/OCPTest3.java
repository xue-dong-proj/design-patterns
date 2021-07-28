package nuc.edu.test3;

/**
 * @author 薛东
 * @date 2021/7/20 11:25
 */
public class OCPTest3 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor{
    public void drawShape(Shape shape){
        shape.draw();
    }
}

abstract class Shape{
    int shape_id;

    abstract void draw();
}

class Rectangle extends Shape{
    Rectangle(){
        super.shape_id = 1;
    }

    @Override
    void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape{
    Circle(){
        super.shape_id = 2;
    }

    @Override
    void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

class Triangle extends Shape{
    Triangle(){
        super.shape_id = 3;
    }

    @Override
    void draw() {
        System.out.println(" 绘制三角形 ");
    }
}