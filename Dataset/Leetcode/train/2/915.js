 var XXX = function(l1, l2) {
    function reverse(arr) {
        let arrs = [];
        for (let i=arr.length; i>0; i--) {
            arrs.push(arr[i-1])
        }
        return arrs
    }
    let newl1 = reverse(l1).join('');
    let newl2 = reverse(l2).join('');
    let l3 = (parseInt(newl1) + parseInt(newl2)).toString();
    let arr = [];
    for (let i=0; i<l3.length; i++) {
        arr.push(parseInt(l3.slice(i, i+1)));
    }
    return reverse(arr);
};

