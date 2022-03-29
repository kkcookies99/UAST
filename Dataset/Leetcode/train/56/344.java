 class Solution {
    public int[][] XXX(int[][] intervals) {
        int length = intervals.length;
        sort(intervals, 0, length);
        List<int[]> list = new ArrayList<>();
        int[] temp = null;
        for (int[] interval : intervals) {
            if (temp != null && interval[0] > temp[1]) {
                list.add(temp);
                temp = null;
            }
            if (temp == null) {
                temp = interval;
            }
            if (interval[0] <= temp[0]) {
                temp[0] = interval[0];
            }
            if (interval[1] >= temp[1]) {
                temp[1] = interval[1];
            }
        }
        if (temp != null) {
            list.add(temp);
        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void sort(int[][] intervals, int start, int end) {
        if (start < end) {
            int[] temp = intervals[start];
            int i = start;
            for (int j = start + 1; j < end; j++) {
                if ((intervals[j][0] < temp[0]) || (intervals[j][0] == temp[0] && intervals[j][1] < temp[1])) {
                    swap(intervals, ++i, j);
                }
            }
            intervals[start] = intervals[i];
            intervals[i] = temp;
            sort(intervals, start, i);
            sort(intervals, i + 1, end);
        }
    }

    public void swap(int[][] intervals, int i, int j) {
        if (i != j) {
            int[] temp = intervals[i];
            intervals[i] = intervals[j];
            intervals[j] = temp;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


