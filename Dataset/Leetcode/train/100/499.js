 var XXX = function(p, q) {
    if(p === q) return true;
    if(!p || !q) return false;
    return p.val === q.val && XXX(p.left, q.left) && XXX(p.right, q.right)
};

