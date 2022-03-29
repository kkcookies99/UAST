 var XXX = function(nums) {
    let len = nums.length;//长度会变化 所以先存起来
    for(var i=0;i<len;i++){
        if(nums[i]==0){ //小的放前面 并把当前位置元素删除
            nums.unshift(nums[i]);
            nums.splice(i+1,1);
        }else if(nums[i] == 2){ //大的添加在后面 避免影响后面元素 所以不删除所在位置的元素 只是标记下
            nums.push(nums[i]);
            nums.splice(i,1,-1);
        }
    }

    //删除标记了-1的元素
    let afterLen = nums.length
    for(var j=0;j<afterLen;){
        if(nums[j] == -1){
            nums.splice(j,1);
            afterLen = afterLen-1;
        }else{
            j++
        }
    }
};

