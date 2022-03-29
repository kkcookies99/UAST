 var XXX = function(height) {
    let leftPoint = 0
        let rightPoint = height.length - 1
        let maxHeight = 0
        while(leftPoint<rightPoint){
            if(height[leftPoint]<height[rightPoint]){
                maxHeight =(maxHeight>height[leftPoint]*(rightPoint-leftPoint)?maxHeight:height[leftPoint]*(rightPoint-leftPoint))
                leftPoint++
            }else{
                maxHeight =(maxHeight>height[rightPoint]*(rightPoint-leftPoint)?maxHeight:height[rightPoint]*(rightPoint-leftPoint))
                rightPoint--
            }
        }
        return maxHeight
};

