class Solution {
    public int XXX(String s) {
        // 将罗马数字字符串转为char数组
        char[] c = s.toCharArray();
        int[] nums = new int[s.length()];
        for(int i = 0;i < c.length;i++){
            if(c[i] == 'I'){
                nums[i] = 1;
            }else if(c[i] == 'V'){
                nums[i] = 5;
            }else if(c[i] == 'X'){
                nums[i] = 10;
            }else if(c[i] == 'L'){
                nums[i] = 50;
            }else if(c[i] == 'C'){
                nums[i] = 100;
            }else if(c[i] == 'D'){
                nums[i] = 500;
            }else {
                nums[i] = 1000;
            }
        }

        int res = 0;
        for(int i = 0;i < nums.length;){
            // i != nums.length-1 防止下标越界
            if(i != nums.length-1 && nums[i] < nums[i+1]){
                res += nums[i+1] - nums[i];
                i = i+2;
                continue;
            }
            res += nums[i];
            i++;
        }
        return res;
    }
}

