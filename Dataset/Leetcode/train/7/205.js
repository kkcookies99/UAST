var XXX = function(x) {
const max = Math.pow(2, 31);
const min = max * -1;
let n = Math.abs(x);
  let XXXStr = n.toString().split('').XXX().join('');
    if (x < 0) {
        XXXStr *= -1;
    }
    if (XXXStr > max || XXXStr < min) {
        return 0;
    }
    return XXXStr;
};

