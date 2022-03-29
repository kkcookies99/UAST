var XXX = function(height) {
    height.unshift(0)
    const biggerStack = [];
    const biggerIndex = [];
    let maxValue = 0;
    for(let i=0;i<height.length;i++){
        if(biggerStack.length==0){
            biggerIndex.push(i);
            biggerStack.push(height[i])
        }else{
            for(let j=0;j<biggerStack.length;j++){
                let current = (i-biggerIndex[j])*Math.min(height[i],biggerStack[j]);
                if(maxValue<current){
                    maxValue = current;
                }
            }
            if(biggerStack[biggerStack.length-1]<height[i]){
                biggerIndex.push(i);
                biggerStack.push(height[i])
            }
        }
    }
    return maxValue;
};

