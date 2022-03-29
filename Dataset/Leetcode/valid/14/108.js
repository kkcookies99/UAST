 var XXX = function(strs) {
    strs.sort();
    let arr = [...strs[0]]
    let matchStr=""
    // 排序之后只需要对比第一个和最后一个的相同项即可
    for(let i=0;i<arr.length;i++){
        if(arr[i]==strs[strs.length-1][i]){
            matchStr+=arr[i]
        }else{
            break;
        }
    }
    return matchStr
};

