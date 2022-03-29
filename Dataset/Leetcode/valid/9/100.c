bool XXX(int x){
        int len = 0;
        int nums[32];
        int temp = x;
        if(x<0){
            return false;
        }
        while(temp != 0){
            nums[len] = temp % 10;
            len++;
            temp = temp / 10;
        }
        if(len==1){
            return true;
        }
        else{
            int start = 0;
            while(start <= len-1){
                if(nums[start] == nums[len-1]){
                    start++;
                    len--;
                }
                else{
                    return false;
                }
            }
            return true;
        }
}

