 class Solution {
    public int[][] XXX(int[][] intervals) {
        /**
            思路：1.将二维数组中的每一个元素，对其第一位比较进行排序
                 2.新建res集合，将合并数组存入该集合中
        **/
        
        if(intervals == null || intervals.length == 0){
            return new int[1][0];
        }

        return method1(intervals);
              
    }

    public int[][] method1(int[][] intervals){
        // 1. 对intervals 内部进行排序 —— 采用 comparator接口
        Arrays.sort(intervals,new Comparator<int[]>(){

            @Override
            public int compare(int[] o1,int[] o2){
                return o1[0] - o2[0];
            }
        });

        List<int[]> res = new ArrayList<>(); // 结果数组
        for(int i = 0;i < intervals.length;++i){
            if(res.size() == 0){ // 直接将intervals中的第一个元素添加进 res中
                int[] temp = new int[]{intervals[i][0],intervals[i][1]};
                res.add(temp);
                continue;
            }
            // 取集合中最后一个元素
            int[] lastElement = res.get(res.size() - 1);
            if(intervals[i][0] <= lastElement[1]){ // 合并
                int max = Math.max(lastElement[1],intervals[i][1]);
                res.get(res.size() - 1)[1] = max;
            }else{ // 将该数组添加进行集合中
                int[] temp = new int[]{intervals[i][0],intervals[i][1]};
                res.add(temp);
            }
        }

        return res.toArray(new int[res.size()][]);

    }
}

