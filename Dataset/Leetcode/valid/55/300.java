public boolean XXX(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        if(nums[0] == 0){
            return false;
        }
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] ==0){
                if(!isReachable(nums, i)){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean isReachable(int[] nums, int index){
        for(int i = index - 1 ; i >= 0 ; i--){
            //判断可以越过
            int diff = index - i;
            //如果数组最后一位元素是0，需要单独处理
            if(index == nums.length - 1){
                //最后数组一位元素是0，则只要可以达到最后一位元素即可，比较条件 <
                if(nums[i] < diff){
                    continue;
                }else {
                    return true;
                }
            }else {
                //其他条件下，数组元素需要大于其差值（不可等于，因为等于的话，则落在0元素上，无法继续移动）
                if(nums[i] <= diff){
                    continue;
                }else{
                    return true;
                }
            }


        }
        return false;
    }

