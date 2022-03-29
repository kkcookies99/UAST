 class Solution {
    public int[][] XXX(int[][] intervals) {
        boolean isContinue = true;
        int size = intervals.length;
        while (isContinue) {
            isContinue = false;
            for (int i=0 ;i<intervals.length; i++) {
                if (intervals[i] != null) {
                    for (int j=i+1; j<intervals.length; j++) {
                        if (isContains(intervals[i], intervals[j])) {
                            intervals[i] = XXX(intervals[i], intervals[j]);
                            intervals[j] = null;
                            size--;
                            isContinue = true;
                        }
                    }
                }
            }
        }
        int[][] result = new int[size][2];
        int i=0, j=0;
        while (i < size) {
            if (intervals[j] == null) {
                j++;
                continue;
            }
            result[i] = intervals[j];
            i++;
            j++;
        }
        return result;
    }

    private boolean isContains(int[] a, int[] b) {
        if (b == null || a== null) return false;
        if (b[1] > a[1]) {
            return b[0] <= a[1];
        } else if (b[1] < a[1]) {
            return a[0] <= b[1];
        } else {
            return true;
        }
    }

    private int[] XXX(int[] a, int[] b) {
        int start = Math.min(a[0], b[0]);
        int end = Math.max(a[1], b[1]);
        return new int[]{start, end};
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


