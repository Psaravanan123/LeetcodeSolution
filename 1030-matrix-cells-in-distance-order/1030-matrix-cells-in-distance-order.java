import java.util.*;

public class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<int[]> cells = new ArrayList<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                cells.add(new int[] {r, c});
            }
        }
        cells.sort((a, b) -> {
            int distA = Math.abs(a[0] - r0) + Math.abs(a[1] - c0);
            int distB = Math.abs(b[0] - r0) + Math.abs(b[1] - c0);
            return Integer.compare(distA, distB);
        });
        return cells.toArray(new int[cells.size()][]);
    }
}
