// TOWER OF HANOI
// You have 3 towers and N disks of different sizes which can 
// slide onto any tower. The puzzle starts with disks sorted in ascending 
// order of size from top to bottom (i.e.,each disk sits on top of an even larger one

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
}
