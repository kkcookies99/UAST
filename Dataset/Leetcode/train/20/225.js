 var XXX = function(s) {
    if (!s) {
        return true;
    }
    var arr = s.split('');
    var stack = [];
    for (var i = 0; i < arr.length; i++) {
        var item = arr[i];
        // 左括号
        if (item === '(' || item === '[' || item === '{') {
            stack.push(item);
        } else {
            var left = null;
            switch (item) {
                case ')':
                    left = '(';
                    break;
                case ']':
                    left = '[';
                    break;
                case '}':
                    left = '{';
                    break;
            }
            if (left !== stack.pop()) {
                return false;
            }
        }
    }
    return stack.length ? false : true;
};

