 var XXX = function(num) {
     // make a dictionary, 
   let dict = [
        ["", "M", "MM", "MMM"],
        ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"],
        ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"],
        ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]
    ];
   
   //凑满4位数, 拆成数组，每个数字转成字典里对应的罗马数字，再转回字串
    return ("000" + num).replace(/.*(....)$/, "$1").split("").map((n, i) => dict[i][+n]).join(""); 
};

