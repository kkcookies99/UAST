var XXX = function(x) {
let left=0,right=x,mid;
if(x===1||x===0){
    return x;
}
while(left<right){
    mid=left+~~((right-left)/2);
    if(x/mid<mid){
        right=mid;
    }else{
        left=mid+1;
    }
}
return left-1
};
