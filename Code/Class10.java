class Square {

    int side = 5;

    int area(){
        return this.side*this.side;
    
}
}

class Circle{
    double radius = 4.5;

    double circ() {
        return 2*(this.radius*3.1415);
    }

    double area() {
        return 3.1415*(this.radius)*(this.radius);
    }
}
class Class10{
    public static void main(String args[]){
        Circle c1 = new Circle();
        c1.radius = 2;
        System.out.println(c1.area());
        System.out.println(c1.circ());
        Square sqr1 = new Square();
        sqr1.side = 7;
        System.out.print(sqr1.area());
    //     int num1 = 13;
    //     int num2 = 5;
    //     int q = 0;
    //     while(num1>=num2){
    //         num1-=num2;
    //         q++;
    //     }
    //     System.out.println(q);
    //     System.out.println(num1);

    }
}