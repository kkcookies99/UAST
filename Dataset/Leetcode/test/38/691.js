 var XXX = function(n) {
    if (n == 1) {
        return "1";
    }
    let arr = ["1"];
    let tmp, j, k;
    for (let a = 2; a <= n; a++) {
        tmp = [];
        j = 0;
        k = 1;
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                k++;
                continue;
            }
            tmp[j] = k;
            tmp[++j] = arr[i];
            j++;
            k = 1;
        }
        arr = [...tmp];
    }
    return arr.join("");
};

