
public class Object_Class {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red", 5);
        System.out.println(p1.color + " and " + p1.tip);

        Student st1 = new Student();
        st1.calcPercentage(50, 59, 89);
        System.out.println(st1.percentage);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor, int newTip) {
        color = newColor;
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
