var XXX = function(x) {
    const isSign = Math.sign(x); // 获取原始数字符号
    const num = Math.abs(x); // 取绝对值
    
    const formatNum = num.toString().split("").XXX().join(""); // 绝对值 -> 字符串 -> 数组 -> 反转数组 -> 字符串
    const result = formatNum * isSign; // 添加正负号
    
    const start = Math.pow(2, 31) - 1; // 区域 右端点
    const end = -Math.pow(2, 31); // 区域 左端点

    if(result < start && result > end) {
        return result;
    } 
    
    return 0;
};

