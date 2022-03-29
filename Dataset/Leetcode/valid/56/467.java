 class Solution {
    public int[][] XXX(int[][] intervals) {
        //找到能合并的条件
        //一个集合的开始区间位于另外一个集合的闭合区间之前
        //即 【start1，end1】[start2,end2]
        //start2<end1
        //此时如果不进行排序，还要对start1和start2来进行排序
        //那么我们可以按照start升序来重新排列intervals
        if(intervals==null && intervals.length<=1)return intervals;
        //新建一个lsit集合来被遍历后的数组
        List<int[]> list = new ArrayList<>();  
        //按照数组首元素进行升序排列，重写compare方法
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] i1, int[] i2){
                return i1[0]-i2[0];
            }
        });
        //未采用list之前，测试用例最终输出[null，[1,6],[8,10],[15,18]]
        //接下来就是想着怎么将null删除
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
        //所要对比的数据
        int prestart=intervals[i-1][0];
        int preend=intervals[i-1][1];
        int curstart=intervals[i][0];
        int curend=intervals[i][1];
        //先将原来的数据都放入list中，合并则该，不合并则保持
        list.add(intervals[i]);
        if(curstart<=preend ){
            intervals[i][0]=prestart;
            intervals[i][1]=Math.max(curend,preend);
            list.set(i,intervals[i]);
            list.set(i-1,null);
        }
        
        }
        //删除null
        while(list.remove(null));
        //lsit to 数组
        return list.toArray(new int[list.size()][2]);
    }
}

