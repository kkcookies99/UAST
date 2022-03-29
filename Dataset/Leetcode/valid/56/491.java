 class Solution {
    public int[][] XXX(int[][] intervals) {
        int len = 10001;
        int[] rp = new int[len];
        int[] rn = new int[len];
        Arrays.fill(rp,0);
        Arrays.fill(rn,0);
        for(int[] e:intervals){
            rp[e[0]]++;
            rn[e[1]]++;
        }
        int s = 0,  cnt = 0, j = 0;
        //s是记录新的起点，cnt是起点与终点的差，j是ans的下标，先暂存到intervals
        boolean isStart = true;
        //是否进入一次新的寻找
        for(int i=0;i<len;i++){
            //找新起点
            while(isStart&&i<len&&rp[i]+rn[i]==0){
                i++;
                s = i;
            }
            isStart = false;
            if(i >= len) 
                break;
            //起点＋，终点-
            cnt = cnt+rp[i]-rn[i];  
            if(cnt==0){
            //匹配结束
                intervals[j][0] = s;
                intervals[j][1] = i;
                j++;
                s = i+1;
                isStart = true;
            }            
        }
        int[][] ans = new int[j][2];
        for(int i=0;i<j;i++){
            ans[i][0] = intervals[i][0];
            ans[i][1] = intervals[i][1];
        }
        return ans;
    }
}

