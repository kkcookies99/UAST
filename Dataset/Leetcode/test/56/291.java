 class Solution {
    public int[][] XXX(int[][] intervals) {
        LinkedList<int[]> list = new LinkedList<>();
        list.add(intervals[0]);
        int[] temp;
        int[] head;
        int n;
        for (int i = 1;i < intervals.length;i++){
            temp = intervals[i]; //逐个取出每个区间
            n = list.size();
            for (int j = 0;j < n;j++){ //与已在list的所有区间进行比较
                head = list.removeFirst(); //取出一个list的区间
                if (head[1] < temp[0] || head[0] > temp[1]){ //如果不重合
                    list.addLast(head); //再放回去（由于遍历次数n的限制，保证了再放回去的区间不会重复遍历）
                }else{ // 重合则取大区间（head就没必要再放回去了）
                    temp[0] = Math.min(temp[0],head[0]);
                    temp[1] = Math.max(temp[1],head[1]);
                }
            }
            list.addLast(temp); //最后添加temp
        }

        //list放入数组
        int[][] r = new int[list.size()][2];
        for (int i = 0;i < list.size();i++){
            r[i][0] = list.get(i)[0];
            r[i][1] = list.get(i)[1];
        }
        return r;
    }
}

