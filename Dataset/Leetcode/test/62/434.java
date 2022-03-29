class Solution {
    public int XXX(int m, int n) {
        Queue<Integer[]> queue = new LinkedList<>();
        Integer[] arr = new Integer[]{m,n};
        queue.offer(arr);
        int num = 0;
        //BFS
        while(!queue.isEmpty()){
            int cur = queue.size();
            for(int i=0;i<cur;i++){
                Integer[] queueArr = queue.peek();
                if(queueArr[0] == 1 && queueArr[1] == 1 ){
                    num++;
                    queue.poll();
                    continue;
                }
                //left
                if(queueArr[0]>1){
                    Integer[] addArr = new Integer[]{queueArr[0]-1,queueArr[1]};
                    queue.offer(addArr);
                }
                //right
                if(queueArr[1]>1){
                    Integer[] addArr = new Integer[]{queueArr[0],queueArr[1]-1};
                    queue.offer(addArr);
                }             
                queue.poll();
            } 
        }
        return num;
    }
}

