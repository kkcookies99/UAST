 var XXX = function(p, q) {
    if(!p && !q) return true;
    if(!p || !q || q.val !== p.val) return false;
    return XXX(p.left, q.left) && XXX(p.right,q.right)
};
var XXX = function(p, q) {
    const queue1 = [p];
    const queue2 = [q];
    while(queue1.length && queue2.length) {
        const n1 = queue1.pop();
        const n2 = queue2.pop();
        if(!n1 && !n2) continue;
        if(!n1 || !n2 || n1.val !== n2.val) return false;
        queue1.push(n1.left,n1.right);
        queue2.push(n2.left,n2.right);
    }
    return true
};

