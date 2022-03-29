 var XXX = function(s) {
    let sum = 0, count = 0, set = new Set();
    for (let l = 0, r = 0; r < s.length;) {
        if (set.has(s.charAt(r))) {
            sum = Math.max(count, sum);
            l++;
            r = l;
            set.clear();
            count = 0;
        }
        count++;
        set.add(s.charAt(r++));
    }
    return sum > count ? sum : count;
};

