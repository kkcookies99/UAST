var XXX = function(x) {
    if (x === 0) {
        return true;
    } else if (x < 0 || x % 10 === 0) {
        return false;
    } else {
         x = x + '';
         let temp = x.split('');
         let right = temp.length - 1;
         for (let i = 0; i < temp.length / 2; i++) {
             if (temp[i] !== temp[right]) {
                 return false;
             }
             right--;
         }
         return true;
    }
};

