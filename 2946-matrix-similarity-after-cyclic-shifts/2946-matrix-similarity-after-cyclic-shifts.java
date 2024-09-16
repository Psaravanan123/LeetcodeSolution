class Solution {
    public boolean areSimilar(int[][] res, int r) {
        int mat[][] = new int[res.length][res[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = res[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int rowLength = mat[i].length;
            int effectiveRotation = r % rowLength;

            if (i % 2 == 0) {
                rotateLeft(mat[i], effectiveRotation);
            } else {
                rotateRight(mat[i], effectiveRotation);
            }
        }
        for (int j = 0; j < mat.length; j++) {
            for (int k = 0; k < mat[0].length; k++) {
                if (mat[j][k] != res[j][k]) {
                    return false;
                }
            }
        }
        return true;
    }
    private void rotateLeft(int[] row, int positions) {
        int length = row.length;
        if (length == 0) return;
        positions = positions % length;
        if (positions == 0) return;
        
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = row[(i + positions) % length];
        }
        System.arraycopy(temp, 0, row, 0, length);
    }
    private void rotateRight(int[] row, int positions) {
        int length = row.length;
        if (length == 0) return;
        positions = positions % length;
        if (positions == 0) return;
        
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = row[(i - positions + length) % length];
        }
        System.arraycopy(temp, 0, row, 0, length);
    }
}
