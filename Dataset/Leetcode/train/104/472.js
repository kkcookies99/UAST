var XXX = function(root) {
    if (!root) {
        return 0;
    }
    var queue = [root], res = 0;
    while (queue.length > 0) {
        res++;
        var newQueue = [];
        for (var i = 0, len = queue.length; i < len; i++) {
            queue[i].left && newQueue.push(queue[i].left);
            queue[i].right && newQueue.push(queue[i].right);
        }
        queue = newQueue;
    }
    return res;
}

