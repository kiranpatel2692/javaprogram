package javaprogram;

class tri {
    float length, width, heigth;

    void setAttr(float l, float w, float h) {
        length = l;
        width = w;
        heigth = h;
    }

    double area() {
        return (length * width * heigth);
    }

    void display() { // Corrected method name
        System.out.println(length);
        System.out.println(width);
        System.out.println(heigth);
    }
}

public class Triangle {
    public static void main(String[] args) {
        tri t1 = new tri();
        tri t2 = new tri();

        t1.display();
        t2.display();

        t1.setAttr(7, 5, 6);
        t2.setAttr(4, 6, 7);

        t1.display();
        t2.display();

        // Accessing attributes using getter methods
        System.out.println("Length: " + t1.length + " Width: " + t1.width + " Height: " + t1.heigth+ " is "+t1.area());
        System.out.println("Length: " + t2.length + " Width: " + t2.width + " Height: " + t2.heigth+ " is "+t2.area());
    }
}
