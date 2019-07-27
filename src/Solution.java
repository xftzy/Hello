public class Solution {

    public boolean Find(int target, int[][] array) {
        int m = array.length - 1;
        int i = 0;
        while (m >= 0 && i < array[0].length) {
            if (array[m][i] > target) {
                m--;
            } else if (array[m][i] < target) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }
}
