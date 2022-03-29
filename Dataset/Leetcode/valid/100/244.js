 var XXX = function(p, q) {
    if(p&&q){
       return p.val==q.val && XXX(p.right,q.right) && XXX(p.left,q.left)
    }else if(!p&& !q){
        return true
    }else{
        return false
    }
};

