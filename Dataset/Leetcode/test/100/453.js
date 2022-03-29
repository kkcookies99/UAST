 var XXX = function(p, q) {
    if (p === null && q === null) return true;
    if (p === null || q === null) return false;
    if (p.val === q.val && XXX(p.left, q.left) && XXX(p.right, q.right)) return true
    return false;
};

