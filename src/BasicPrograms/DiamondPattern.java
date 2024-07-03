package BasicPrograms;

public class DiamondPattern {

    public static void main(String[] args) {
        printDiamond(5);
    }

    public static void printDiamond(int n) {
        int space = n-1;
        for (int i=0;i<=space;i++) {
            for (int j=0;j<space-i;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        space = 0; //number of stars in the middle space
        for(int i=n;i> 0;i--) {
            for (int j=0;j<space;j++) {
                System.out.print(" ");
            }
            for (int j=0;j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
            space++;
        }
    }
}
