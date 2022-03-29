 var XXX = function(nums, target) {
var cbArr = [];
for(var i = 0; i< nums.length; i++){
    if(cbArr.indexOf(i) == -1){ //除去已经在结果里面的 避免重复
        for(var k = 0; k< nums.length; k++){
            if((i !== k) && (nums[i]+ nums[k] == target)){
                cbArr.push(i,k);
            }
        }
    }
}
return cbArr;
};

