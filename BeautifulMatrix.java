import java.util.Scanner;
public class BeautifulMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int[][] matrix = new int[5][5];
int row = 0, col = 0;
    // Read the input matrix and find the coordinates of the number 1
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            matrix[i][j] = sc.nextInt();
            if (matrix[i][j] == 1) {
                row = i;
                col = j;
            }
        }
    }

    // Calculate the minimum number of row and column swaps needed to move the number 1 to its desired position
    int rowSwaps = Math.abs(row - 2);
    int colSwaps = Math.abs(col - 2);

    System.out.println(rowSwaps + colSwaps);
}

    }
