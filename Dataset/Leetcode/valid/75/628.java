 class Solution {
    public void XXX(int[] nums) {
        int colorNum = 3;
        //申请一个临时数组，保存每种颜色出现的次数，多出的一个位置是为了避免边界条件的判断
        int[] temp = new int[colorNum + 1];

        //计算每种颜色出现次数
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]]++;
        }

        //将每种颜色出现的次数累加，得到每种颜色的索引范围
        for(int i = 1; i < temp.length; i++){
            temp[i] = temp[i - 1] + temp[i];
        }

        //将计数数组中每个颜色扫描后映射到原数组中
        int p = 0;
        for(int i = 0; i < temp.length; i++){
            int q = p;
            while(q >= p && q < temp[i]){
                nums[q] = i;
                q++;
            }
            p = q;
        }
    }
}

