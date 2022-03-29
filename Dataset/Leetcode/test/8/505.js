 var XXX = function(s) {
	let arr = ['+','-','0','1','2','3','4','5','6','7','8','9']
    let num=0
    let res=''
    while(s[num] == ' '){
        num++
    }
    if(arr.indexOf(s[num])==-1 || s[num+1] == '-' || s[num+1] == '+'){
        return 0
    }
    while(arr.indexOf(s[num])!=-1){
        res += s[num]
        num++
    }
    res = parseInt(res)
    if(!res) return 0
    res=Math.max((-2)**31,res);
    res=Math.min(2**31-1,res);
    return res
};

