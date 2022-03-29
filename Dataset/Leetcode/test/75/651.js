 var XXX = function(nums) {
    let zero=-1,two=nums.length;
    for(let i=0;i<two;){
        if(nums[i] == 1){
            i++;
        }else if(nums[i]==2){
            two--;
            swap(i,two);
        }else{
            zero++;
            swap(zero,i);
            i++;
        }
    }

    function swap(i,j){
        let tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }

    return nums;
};

