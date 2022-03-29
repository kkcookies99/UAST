 var XXX = function(s) {
    //判断是否为空串
    if(!s){
        return true;
    }
    var str = "{[(",
        obj = {
            '}':'{',
            ']':'[',
            ')':'('
        };
    var arr = []; //当作栈来存储左括号
    for(var i=0; i<s.length; i++){
        var curr = s.charAt(i);
        //遇左括号则进栈
        if(str.indexOf(curr) >= 0){
            arr.push(curr);
        }else{
            //如果右括号不匹配刚刚进栈的元素则无效
            var len = arr.length;
            if(len === 0){//如果此时arr中还没存任何左括号则无效
				return false;
            }
            //当右括号匹配左括号就出栈
            if(arr[len-1] === obj[curr]){
                arr.pop();
            }else{
                return false;
            }
        }
    }
    //遍历结束数组中还有元素说明左括号未完全匹配成功
    if(arr.length>0){
        return false;
    }
    return true;
};

