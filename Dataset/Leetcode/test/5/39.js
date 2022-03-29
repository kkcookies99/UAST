 var XXX = function(s) {
    //定义回文子串变量
    let substring='';
    //双重遍历字符串（截取子串判断是否是回文子串）
    for(let i=0;i<s.length;i++){
        for(let j=i;j<s.length;j++){
            //截取子串
            let str=s.slice(i,j+1);
            //判断该子串是否是回文子串
            for(let k=0;k<str.length/2;k++){
                if(str[k]===str[str.length-k-1]){
                    continue;
                }else{
                    str=''
                }
            }    
            //更新回文子串值
            substring=str.length>substring.length?str:substring
        }
    }
    return substring;
};

