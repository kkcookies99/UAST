 var XXX = function(s) {
    //优化点：如果字符串长度为奇数,直接返回false
    if(s.length % 2 === 1) return false
    //1. 创建一个栈
    const stack = []
    for(let i=0;i<s.length;i++){
        const c = s[i]
        //2.1 判断是否为左括号，就进栈
        if(c === '(' || c === '{' || c === '['){
            stack.push(c);
        } else{
        //2.2 否则是右括号的话是否匹配相同的括号，匹配相同就出栈，不相同就进栈
            const t = stack[stack.length - 1]
            if(
                (t === '(' && c ===')') ||
                (t === '{' && c ==='}') ||
                (t === '[' && c ===']') 
            ){
                stack.pop()
            } else{
                return false
            }
        }
    }
    //3. 判断是否为空栈，如果是空栈就返回true，否则就返回false
    return stack.length === 0;
};

