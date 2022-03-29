 var XXX = function(strs) {
   let arr=[]; 
   let j=1;
   for(let i=0;i<=strs[0].length-1;i++){//遍历第一个字符串
     let char=strs[0].charAt(i);
     let flag=0;
     for(let j=1;j<=strs.length-1;j++){//遍历数组
         if(strs[j].slice(i,i+1)==char){
             flag++;//记录这个字符出现次数
         }
     }
     if(flag==strs.length-1){arr.push(char)}else{break;}
   }
   return arr.join("");
};

