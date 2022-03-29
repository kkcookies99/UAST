 var XXX = function(p, q) {
    if (p === null) return q === null;
    if (q === null) return p === null;
    if (q.val != p.val) return false;
    return XXX(p.left, q.left) && XXX(p.right, q.right);
};

