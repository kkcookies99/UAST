 var XXX = function(nums, target) {
    for(let i=0;i<nums.length;i++){ //从从第一个元素开始，取一个元素
        let difference=target-nums[i];  //target减去第一个数
        let j=nums.indexOf(difference); //值是否存在数组中，返回位置
        if(j>-1 && i!=j){    //值存在数组中，并且两个数下标不相同
            console.log([i,j]);     //返回数组中的两个数的位置
            return ;    //结束程序
        }
    }
};

