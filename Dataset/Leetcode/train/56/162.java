 class Solution {
    public int[][] XXX(int[][] intervals) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> rightStack = new Stack<>();
        int[] leftArr = new int[intervals.length];
        int[] rightArr = new int[intervals.length];
        for (int i = 0; i < rightArr.length; i++){
            leftArr[i] = intervals[i][0];
            rightArr[i] = intervals[i][1];
        }
        Arrays.sort(leftArr);
        Arrays.sort(rightArr);
        for (int i = 0; i < intervals.length; i++){
            if (leftStack.isEmpty() || leftArr[i] > rightStack.peek()){
                leftStack.push(leftArr[i]);
                rightStack.push(rightArr[i]);
            }
            else {
                if (rightArr[i] > rightStack.peek()){
                    rightStack.pop();
                    rightStack.push(rightArr[i]);
                }
            }
        }
        int[][] ans = new int[rightStack.size()][2];
        for(int i = 0; i < ans.length; i++){
            ans[i][0] = leftStack.get(i);
            ans[i][1] = rightStack.get(i);
        }
        return ans;

    }
}

