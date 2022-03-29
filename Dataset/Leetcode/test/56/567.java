 class Solution {
    public int[][] XXX(int[][] intervals) {
        int yMaxIndex = intervals.length - 1;

        if (yMaxIndex == 0) {
            return intervals;
        }

        //先排序
        int[] tempIntervals;
        for (int i = 0; i <= yMaxIndex; i++) {
            for (int j = i + 1; j <= yMaxIndex; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    tempIntervals = intervals[j];
                    intervals[j] = intervals[i];
                    intervals[i] = tempIntervals;
                }
            }
        }

        //后堆叠
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int pop;
        for (int[] interval : intervals) {
            if (stack.isEmpty()) {
                stack.push(interval[0]);
                count++;
                stack.push(interval[1]);
            } else {
                pop = stack.pop();
                if (interval[0] >= pop + 1) {
                    stack.push(pop);
                    stack.push(interval[0]);
                    count++;
                    stack.push(interval[1]);
                } else {
                    stack.push(Math.max(pop, interval[1]));
                }
            }
        }

        int[][] temp = new int[count][2];
        for (int i = count - 1; i >= 0; i--) {
            temp[i][1] = stack.pop();
            temp[i][0] = stack.pop();
        }

        return temp;
    }
}

