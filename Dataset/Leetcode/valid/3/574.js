 var XXX = function(s) {
        // 记录字符上一次出现的位置
        var last = Array.from({length:128},()=>-1);
        var res = 0;
        var start = 0; // 窗口开始位置
        for(var i = 0; i < s.length; i++) {
            var index =  s.charAt(i).charCodeAt();
            start = Math.max(start, last[index] + 1);
            res= Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


