 var XXX = function(root) {
    var flag = true
    for (var i = 0; i < root.length; i++) {
        if (root[i] !== null) {
            if ((2*i+1)<root.length && root[2*i+1] !== null) {
                if (root[i] < root[2*i+1]) {
                    flag = false
                    break
                }
            }
            if ((2*i+2)<root.length && root[2*i+2] !== null) {
                if (root[i] > root[2*i+2]) {
                    flag = false
                    break
                }
            }
        }
    }
    return flag
};

