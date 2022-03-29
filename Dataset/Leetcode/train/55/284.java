public boolean XXX(int[] nums) {
        int tmp = nums.length - 1;
        for(int i = nums.length - 2;i >= 0; i -- ){
            if(nums[i] + i >= tmp){
                tmp = i;
            }
        }
        if(tmp == 0){
            return true;
        }else {
            return false;
        }
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


