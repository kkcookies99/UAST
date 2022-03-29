var XXX = function(a, b) {
    var res=[];//结果的数组
    var max;
    var min;
    if(a.length<b.length){
        max=b;
        min=a.padStart(max.length,0)
    }else{
        max=a;
        min=b.padStart(max.length,0)
    }
    const minArr=min.split('');
    const maxArr=max.split('');
    var isMore=false;
    var sum=0;
    for(var i=maxArr.length-1; i>=0;i--){
        if(isMore){
            sum=Number(min[i])+Number(+max[i])+1
        }else{
            sum=Number(min[i])+Number(max[i])
        }
        if(sum===2){
            isMore=true;
            res.unshift(0)
            if(i===0){
              res.unshift(1)
            }
        }else if(sum===3){
            isMore=true;
            res.unshift(1)
            if(i===0){
              res.unshift(1)
            }
        }else{
            isMore=false;
            res.unshift(sum)
        }
    }
    return res.join('')
};

