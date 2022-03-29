var XXX = function(root) {
    if (!root) {
        return [];
    }
    var queue = [root], cloneQue, res = [];
    while (queue.length > 0) {
        cloneQue = queue;
        queue = [];

        var level = [];
        for (var i = 0, len = cloneQue.length; i < len; i++) {
            level.push(cloneQue[i].val);
            cloneQue[i].left && (queue.push(cloneQue[i].left));
            cloneQue[i].right && (queue.push(cloneQue[i].right));
        }
        res.push(level);
    }

    return res;
};

