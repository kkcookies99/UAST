class Solution {
    public int XXX(int[] height) {
        int q_index=0;//前指针
        int h_index= height.length-1;//后指针
        int max=0;

        //min(height[q],height[h])*(h-q)
        while(q_index!=h_index)
        {
            //拿到前后指针指向最小的数值
            int min = Math.min(height[q_index], height[h_index]);

            //计算出当前容量
            int m = min*(h_index-q_index);
            if(max<m)
            {
                max=m;
            }

            //移动指针
            if(min==height[q_index])
            {
                q_index++;
            }
            else {
                h_index--;
            }



        }
        




        return max;
    }
}

