package Problems;

public class rotateMatrix {

public void rotate(int[][] matrix) {
    int len = matrix.length;

    // swap left and right values
    for(int i = 0; i< len / 2; i++){
        int temp[] = matrix[i];
        matrix[i] = matrix[len-1-i];
        matrix[len-1-i] = temp;
    }
    // transpose
    for(int i = 0; i< len ; i++){
        for(int j = i; j< len; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
}
    
}