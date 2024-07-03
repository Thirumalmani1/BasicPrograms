package BasicPrograms;

public class LeftpyramindNumber {
    public static void main(String[] args)
    {
        int totalRows = 5;
        int rowCount = 1;
        for (int i=1;i <= totalRows;i++) {
            for(int j=1;j<=i ;j++) {
                System.out.print(rowCount + "");
            }
            System.out.println("");
            rowCount++;
        }
    }
}
