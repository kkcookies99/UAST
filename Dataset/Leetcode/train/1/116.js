 var XXX = function(nums, target) {
   for(var i = 0; i < nums.length - 1; i++){
       for( k = i + 1; k < nums.length -1 ; k++){
           if(nums[i]+nums[k] == target){
               return [i,k];
           }
       }
   }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


