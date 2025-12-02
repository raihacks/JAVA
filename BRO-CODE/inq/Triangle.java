public class Triangle extends Shape{
    double hight; 
    double base;
    Triangle(double hight, double base){
        this.hight = hight;
        this.base = base;
    }
    @Override
    double area(){
        return hight * base;
    }
}