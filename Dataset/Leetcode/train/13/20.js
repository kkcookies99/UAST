var XXX = function(s) {
    const dic = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 }
    return s.split('').reduce((prev, next, idx, arr) => dic[next] < dic[arr[idx + 1]] ? prev - dic[next] : prev + dic[next], 0)
};

