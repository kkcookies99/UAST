  var XXX = function(nums) {
     var hash=new Map();
     for(var i=0;i<nums.length;i++){
         if(hash.has(nums[i])){
             hash.set(nums[i],hash.get(nums[i])+1);
         }else{
             hash.set(nums[i],1);
         }
     }
     var arr=[... hash],
         res=[];
     for(var i=0;i<arr.length;i++){
         var a=arr[i][0];
         arr[i][1]-=1;
         for(var ii=i;ii<arr.length;ii++){
             if(arr[ii][1]==0)
                 continue;
             var b=arr[ii][0];
             arr[ii][1]-=1;
             var c=0-a-b;
             for(var iii=ii;iii<arr.length;iii++){
                 if(arr[iii][0]==c){
                     if(arr[iii][1]!==0){
                         res.push([a,b,c]);
                     }
                 }
             }
             arr[ii][1]+=1;
         }
         arr[i][1]+=1;
     }
     return res;
};

