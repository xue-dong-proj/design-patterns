package nuc.edu.test2;

/**
 * @author 薛东
 * @date 2021/7/20 11:18
 */
public class OCPTest2 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.draw(new Rectangle());
        graphicEditor.draw(new Circle());
        graphicEditor.draw(new Triangle());

    }
}


class GraphicEditor{
    public void draw(Shape shape){
        if (shape.shape_id == 1){
            drawRectangle(shape);
        } else if (shape.shape_id == 2){
            drawCircle(shape);
        } else if (shape.shape_id == 3){
            drawTriangle(shape
            );
        }
    }

    public void drawRectangle(Shape shape){
        System.out.println(" 绘制矩形 ");
    }

    public void drawCircle(Shape shape){
        System.out.println(" 绘制圆形 ");
    }

    public void drawTriangle(Shape shape){
        System.out.println(" 绘制三角形 ");
    }
}

class Shape{
    int shape_id;
}

class Rectangle extends Shape{
    Rectangle(){
        super.shape_id = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.shape_id = 2;
    }
}

class Triangle extends Shape{
    Triangle(){
        super.shape_id = 3;
    }
}