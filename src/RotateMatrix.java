import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix {
    public static void Rotate(int[][] Array,int Columnsize,int Rowsize)
    {
        int temp=0;
        int Result[][]=new int[Columnsize][Rowsize];
        for(int i=0;i<Columnsize;i++)
        {
            for (int j=0;j<Rowsize;j++)
            {
                Result[i][j]=Array[j][i];
            }
        }
        for(int i=0;i<Result.length;i++) {
            int start = 0;
            int end = Result[0].length - 1;
            while(start<end)
            {
                int temp1=Result[i][start];
                Result[i][start]=Result[i][end];
                Result[i][end]=temp1;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.deepToString(Result));

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Rowsize=scanner.nextInt();
        int Columnsize=scanner.nextInt();
        int Array[][]=new int[Rowsize][Columnsize];
        for(int i=0;i<Rowsize;i++)
        {
            for(int j=0;j<Columnsize;j++)
            {
                Array[i][j]=scanner.nextInt();
            }
        }
        Rotate(Array,Rowsize,Columnsize);
    }
}
