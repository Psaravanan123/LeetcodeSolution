class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
    int originalRows = mat.length;
    int originalCols = mat[0].length;
    int totalElements = originalRows * originalCols;
    if (totalElements != r * c) {
        return mat;
    }

    int[][] res = new int[r][c];
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < originalRows; i++) {
        for (int j = 0; j < originalCols; j++) {
            list.add(mat[i][j]);
        }
    }
    int k = 0;
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            res[i][j] = list.get(k++);
        }
    }
    
    return res;
}
}