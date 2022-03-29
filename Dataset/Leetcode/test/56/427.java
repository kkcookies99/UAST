 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length==0){
            return new int[0][0];
        }
        //heap?
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        //因为对每个范围来说实际上是相当于排好序的
        heap.addAll(Arrays.asList(intervals));

        List<int[]> list = new ArrayList<>();
        int[] temp1 = heap.poll();
        while(!heap.isEmpty()){

            int[] temp2 = heap.poll();

            //因为我们放在了小根堆里 所以所有的tamp1[0]<=temp2[0]的 所以没必要比较这个
            if(temp2[0]>temp1[1]){
                list.add(temp1);
                temp1 = temp2;
            }else if(temp2[0]==temp1[1]){
                temp1[1] = temp2[1];
            }else {//temp2[0]<temp1[1]
                temp1[1] = Math.max(temp1[1],temp2[1]);
            }


        }

        list.add(temp1);

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;


    }
}

