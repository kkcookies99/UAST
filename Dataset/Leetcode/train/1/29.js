 var XXX = function(nums, target) {
   for(let i=0;i<nums.length;i++){
    for(let j=0;j<nums.length;j++){
    if(i!=j){
        if(nums[i]+nums[j]==target){
             return [i,j]
            }
        }  
    }
   }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


