// Given a rout containing 4 directions (e,w,n,s)
// FInd the shortest path to reach destination
// WNEENESENNN

public class shortestPath {
    public static float getShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else {
                System.out.println(path.charAt(i) + " is not any direction!");
                return 0;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNNW";
        System.out.println("Sortest path : " + getShortestPath(path));
    }
}
