 var XXX = function(num) {
    if(num<=0) return;
    const map = new Map([
        [1000,'M'],
        [900,'CM'],
        [500,'D'],
        [400,'CD'],
        [100,'C'],
        [90,'XC'],
        [50,'L'],
        [40,'XL'],
        [10,'X'],
        [9,'IX'],
        [5,'V'],
        [4,'IV'],
        [1,'I'],
    ]);
    let result = '';
    while(num){
        for(arr of map){
            if(num-arr[0] >= 0){
                result += map.get(arr[0]);
                num = num - arr[0];
                break;
            }
        }
    }
    
    return result;
};

