 var XXX = function(nums) {
    var result=[];
    function x(a,b){
        if(a>b)
            return 1;
        return 0;
    }
    nums.sort(x);
    var t=function(arr,m){
        //console.log(m);
        result.push(m);
        if(arr.length==0)
            return 0;
        for(var i=0;i<arr.length;i++){
        t(arr.slice(i+1),m.concat(arr[i]));
        }
    }
    t(nums,[]);
    return result;
};

