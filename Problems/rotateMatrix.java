package Problems;

public class rotateMatrix {

public void rotate(int[][] matrix) {
    int num = matrix.length;

    //Transposing the Matrix
    for(int i = 0; i < num; i++)
    {
        // j = i to swap only once otherwise its twice
        for(int j = i; j< num; j++)
        {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for(int i =0; i < num; i++)
    {
        for(int j = 0; j < (num/2); j++)
        {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][num-1-j];
            matrix[i][num-1-j] = temp;
        }
    }


}
    
}