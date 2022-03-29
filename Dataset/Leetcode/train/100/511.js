 var XXX = function(p, q) {
    if (p == null && q == null)
           return true;
        if (p == null || q == null || p.length!=q.length )
           return false;
        if(p.val == q.val)
        return XXX(p.left,q.left) && XXX(p.right,q.right);
        
        return false;
    
};

