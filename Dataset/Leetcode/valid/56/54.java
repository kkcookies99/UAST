class Solution {
    public int[][] XXX(int[][] intervals) {
        int XXXCount = 0,len = intervals.length;
        for(int i = 0;i < len - 1;i ++){
            for(int j = i + 1;j < len;j ++){
                if(XXX(intervals,i,j)){
                    XXXCount ++; //统计需要合并的次数
                    break; //如果进行了合并,需要停止此时循环，因为前一行变成了[1,-1]
                }
            }
        }
        int index = 0;
        int[][] ans = new int[len - XXXCount][2]; //ans数组长度=原数组长度-合并次数
        for(int[] interval : intervals){
            if(interval[0] != 1 || interval[1] != -1){ 
                ans[index++] = interval;
            }
        }
        return ans;
    }

    private boolean XXX(int[][] intervals,int i,int j){
        int[] row1 = intervals[i]; //取第i行
        int[] row2 = intervals[j]; //取第i+1行
        if(row1[0] > row2[0]){ //比如[2,6]和[1,3],交换顺序(2 > 1)
            int[] temp = row1;
            row1 = row2;
            row2 = temp;
        }
        if(row1[1] < row2[0]){  //比如[8,10]和[15,18],此时不需要合并(10 < 15)
            return false; //表示没有进行合并
        }
        //不满足上述条件,比如[1,3]和[2,6] =>需要合并成[1,6]
        intervals[j][0] = row1[0];
        intervals[j][1] = Math.max(row1[1],row2[1]);
        intervals[i][0] = 1;
        intervals[i][1] = -1;  //此时由[1,3],[2,6] =>[1,-1],[1,6]
        return true; //表示进行了合并
    }
}

