 var XXX = function(p, q) {
    // 分治
    if(!p && !q) return true;// 都是空树
    if(
        p 
        && q
        && p.val === q.val
        && XXX(p.left,q.left)
        && XXX(p.right,q.right)
    )
    return true;
    return false;
};

