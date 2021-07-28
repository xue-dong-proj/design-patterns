package nuc.edu.test1;

/**
 * @author 薛东
 * @date 2021/7/20 11:08
 */
public class OCPTest {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        if (s.shape_id == 1){
            drawRectangle(s);
        }else if (s.shape_id == 2){
            drawCircle(s);
        } else if (s.shape_id == 3){
            drwaTriangle(s);
        }
    }

    public void drawRectangle(Shape s){
        System.out.println(" 绘制矩形 ");
    }

    public void drawCircle(Shape s){
        System.out.println(" 绘制圆形 ");
    }

    public void drwaTriangle(Shape s){
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
    Triangle() {
        super.shape_id = 3;
    }
}