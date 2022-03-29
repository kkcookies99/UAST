var XXX = function(nums) {
    var max=-Infinity;
    var cur=-Infinity;
    var lowMax=-Infinity;
    for(i=0;i<nums.length;i++){
        if(cur==-Infinity){
            cur=nums[i];
        }else{
            cur+=nums[i];
        }
        if(cur<0){
            if(cur>lowMax){
                lowMax=cur;
            }
            cur=-Infinity;
        }
        if(cur>max){
            max=cur;
        }
    }
    return Math.max(max,lowMax);
};

