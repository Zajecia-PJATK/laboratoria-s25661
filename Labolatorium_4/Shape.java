class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Circle2 extends Shape{
    private double radius = 1;
    public Circle2(){

    }
    public Circle2(double radius){
        this.radius = radius;
    }
    public Circle2(String color, boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        double diameter = Math.PI * radius * radius;
        return diameter;
    }
    public double getPerimeter(){
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }
    @Override
    public String toString(){
        return "Circle{Shape{color='"+getColor()+"', filled="+isFilled()+"} radius="+getRadius()+"}";
    }
}
class Rectangle extends Shape{
    protected double width = 1;
    protected double length = 1;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        double area = width * length;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (2*width)+(2*length);
        return perimeter;
    }
    @Override
    public String toString(){
        return "Rectangle{Shape{color='"+getColor()+"', filled="+isFilled()+"} width="+getWidth()+", length="+getLength()+"}";
    }
}

class Square extends  Rectangle{
    public Square(){

    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color, boolean filled, double side){
        super(color,filled,side,side);
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    @Override
    public String toString(){
        return "Square{Rectangle{Shape{color='"+getColor()+"', filled="+isFilled()+"} width="+getSide()+", length="+getSide()+"}}";
    }
}