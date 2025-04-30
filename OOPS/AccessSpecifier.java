// Concept of Access Modifiers

public class AccessSpecifier {
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount();
        p1.username = "Md Abdul Razique";
        // p1.password = "123@raz";
        p1.setPassword("123@raz");

        Student st1 = new Student();
        st1.calcPercentage(50, 59, 89);
        System.out.println(st1.percentage);
    }
}

class BankAccount {
    public String username;
    private String password;

    void setPassword(String newPassword) {
        password = newPassword;
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
