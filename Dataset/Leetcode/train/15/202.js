 var XXX = function(nums) {
    nums=nums.sort((a,b)=>{return a-b});
    let ret=[];
    let a1;
    let obj={};
    for(var i=0;i<nums.length;i++){
        for(var j=i+1;j<nums.length;j++){
            let index=nums.indexOf(0-nums[i]-nums[j],j+1);
            if(index!=-1&&obj[`${nums[i]}${nums[j]}`]==undefined){
                ret.push([nums[i],nums[j],nums[index]]);
                obj[`${nums[i]}${nums[j]}`]=nums[index];
            }
        }
    }
    return ret;
};

