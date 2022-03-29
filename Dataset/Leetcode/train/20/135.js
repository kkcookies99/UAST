 var XXX = function(s) {
    let now = s, pre;  //now 当前字符串, pre 替换前的字符串
    while (pre != now) {
        pre = now;
        now = now.replace('()', '').replace('[]', '').replace('{}', '');
    };
    return !now;
};


var XXX2 = function(s) {
    if (s.length % 2) return false;
    let arr = [];
    //遇到({[往堆栈顶上压入，遇到)}]则取出顶上的元素判断是否为对应的左括号，如果不是返回错误
    for (char of s)
        switch (char) {
            case "(":
            case "[":
            case "{": arr.push(char); break;
            case ")": if (arr.pop() !== "(") return false; break;
            case "]": if (arr.pop() !== "[") return false; break;
            case "}": if (arr.pop() !== "{") return false; break;
        };
    return !arr.length;
};

