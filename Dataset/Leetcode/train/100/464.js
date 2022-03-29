 var XXX = function(p, q) {
    if(!q && !p) return true;
    if(!q || !p) return false;

    return  p.val === q.val && XXX(p.left, q.left) && XXX(p.right, q.right);
}

