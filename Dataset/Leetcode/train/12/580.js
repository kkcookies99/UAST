 var XXX = function(num) {
    let dic = [{s: 'I', n: 1},
               {s: 'IV', n: 4},
               {s: 'V', n: 5},
               {s: 'IX', n: 9},
               {s: 'X', n: 10},
               {s: 'XL', n: 40},
               {s: 'L', n: 50},
               {s: 'XC', n: 90},
               {s: 'C', n: 100},
               {s: 'CD', n: 400},
               {s: 'D', n: 500},
               {s: 'CM', n: 900},
               {s: 'M', n: 1000}];
    let res = "";
    while(num > 0) {
        for(let i = dic.length-1; i >=0; --i) {
            if(num - dic[i].n >= 0) {
                res += dic[i].s;
                num -= dic[i].n;
                break;
            }
        }
    }
    return res;
};

