 var XXX = function(nums) {
  let redIndex = 0;//遇到的下一个0所要安放的位置，并非该位置已经是0
  let blueIndex = nums.length-1;

  for(let i=0;i<= blueIndex;i++){
    // console.log(nums,redIndex,blueIndex,i);
    if(nums[i] === 0){
      swap(nums,redIndex++,i);
    }else if(nums[i] === 2){
      //i不走了，只让blueIndex向左靠过来
      swap(nums,blueIndex--,i--);
    }
  }
};

function swap(arr,i,j){
  [arr[i],arr[j]] = [arr[j],arr[i]];
}

