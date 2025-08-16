import java.util.*;

class Geeks {
    static void getInput() {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine()); // read t safely
        while (t-- > 0) {
            int a = Integer.parseInt(sc.nextLine()); // read int as line
            String s = sc.nextLine(); // read full string line

            System.out.println(a);
            System.out.println(s);
        }
        sc.close();
    }

    public static void main(String[] args) {
        getInput();
    }
}

