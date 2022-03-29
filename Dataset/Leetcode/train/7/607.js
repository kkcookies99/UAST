 var XXX = function(x) {
    var result = 0;
    var item = 0;
    while (x != 0){
        item = x % 10;//取出尾数
        x = x / 10;//去除尾数
        result = item + result * 10;//重组
    }
    return result;
};

