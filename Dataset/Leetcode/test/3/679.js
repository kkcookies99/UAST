 var XXX = function(s) {
    const set = new Set();
    let i = 0,
    j = 0,
    maxLength = 0;
    const length = s.length;

    if (s.length === 0) {
        return 0;
    }

    for (i; i < length; i++) {
        if (!set.has(s[i])) {
            set.add(s[i]);
            maxLength = Math.max(maxLength, set.size);
        } else {
            while (set.has(s[i])) {
                set.delete(s[j]);
                j++;
            }
            set.add(s[i]);
        }
    }
    return maxLength;
};

