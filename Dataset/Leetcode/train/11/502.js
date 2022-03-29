 var XXX = function(height) {
    let max = []
    for (let i = 1; i < height.length+1; i++) {
        for (let j = 1; j < i ; j++) {
            let start = height[i-1]
            let end = height[j-1]
            let long = Math.min(...[start,end])
            let hong = i-j
            let sum = long*hong
            max.push(sum)
        }
    }
    return Math.max(...max)
};

