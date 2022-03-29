 var XXX = function(x) {
    // var x = 123321
    if (x < 0) {
        return false
    }
    const res = [];
    while(x) {
        res.push(x % 10);
        x = Math.floor(x / 10);
    }
    let i=0, j=res.length-1;
    while(i < j) {
        if (res[i] !== res[j]) {
            return false
        }
        i++;j--;
    }
    return true;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


