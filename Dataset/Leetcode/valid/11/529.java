 public int XXX(int[] height) {
    int len = height.length;
    int highest = height[0];
    int res = 0;
    for(int left = 0; left < len; left++){
        if(height[left] == 0)
            continue;
        int max = 0; //以left为挡板的最大容量
        for(int right = len - 1; right > left; right--){
            if(height[right] == 0)
                continue;
            if(height[left] < height[right]){
                max = Math.max(max, (right - left)*height[left]);
                break;
            }else{
                if (height[left]*(right-left) <= max)
                    break;
                max = Math.max(max, (right - left)*height[right]);
            }
        }
        res = Math.max(max, res);
    }
    return res;
}

