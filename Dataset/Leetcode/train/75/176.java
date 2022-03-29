public void XXX(int[] nums) {
    int len = nums.length;
    int r = 0;
    int w = 0;
    int b = 0;
    for (int i = 0; i < len; i++) {
        if(nums[i] == 0){
            r++;
        }else if(nums[i] == 1){
            w++;
        }else if (nums[i] == 2){
            b++;
        }else {
            System.out.println("error!");
            break;
        }
    }

    for (int i = 0; i < r; i++) {
        nums[i] = 0;
    }

    for (int i = r; i < r+w; i++){
        nums[i] = 1;
    }

    for (int i = r+w; i < r+w+b; i++){
        nums[i] = 2;
    }

}

