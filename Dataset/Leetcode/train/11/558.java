 class Solution {
    public int XXX(int[] height) {
        int head = 0;
        int tail = height.length-1;
        int max = 0;
        int tmp = 0;
        while(head<=tail){
            if(height[head]>height[tail]){
                tmp = height[tail]*(tail - head);
                tail--;
            }
            else{
                tmp = height[head]*(tail - head);
                head++;
            }
            if(tmp>max)
                max = tmp;
           
        }

        return max;
    }
}

