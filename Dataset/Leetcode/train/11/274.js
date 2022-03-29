var XXX = function(height) {
    max=0;
    maxheight=0;
    for(let i=0;i<height.length;i++){
        for(let j=1+i;j<height.length;j++){
            if(height[i]>height[j]){
                maxheight=height[j]
                max=(j-i)*maxheight
            }else{
                maxheight=height[i]
                max=(j-i)*maxheight
            }
        }
    }
    return max
};

