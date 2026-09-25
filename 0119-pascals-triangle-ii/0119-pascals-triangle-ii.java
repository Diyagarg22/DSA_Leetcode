import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // Initially, the row contains only 1
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            // Add the last 1 of the new row
            row.add(1);

            // Update from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}