 var XXX = function(n) {
    let str = ''
    let res='1'
    let num = 1
    let s=''
    function count(){
        for(let i=0;i<str.length;i++){
            s=str[i]
            if(str[i] == str[i+1]){
                num++
            }else{
                res+=num+s
                num=1
            }
        }
    }
    for(let i=0;i<n-1;i++){
        str = res
        res = ''
        count()
    }
    return res
};

