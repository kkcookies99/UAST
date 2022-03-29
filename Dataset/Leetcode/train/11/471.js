 var XXX = function(height) {
//     let max=0
//  for(let i=0;i<height.length;i++){
//      for(let j=i+1;j<height.length;j++){
//          if((j-i)*Math.min(height[i],height[j])>=max){
//              max=(j-i)*Math.min(height[i],height[j]);
//          }
//      }
//  }
//  return max;
let i=0,j=height.length-1;
let max=0;
while(i<j){
 max=Math.max(max,(j-i)*Math.min(height[i],height[j]));
 if(height[i]<height[j]){
     i++
 }else{
     j--
 }
}
return max;
};

