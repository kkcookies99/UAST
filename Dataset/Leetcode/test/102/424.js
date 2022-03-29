var XXX = function(root) {
    if(! root) return []
    roots  = [root]
    ans = []
    while (roots.length > 0){
        a = []
        aVal = []
        for (var i=0;i<roots.length;i++){
            aVal.push(roots[i].val)
            if(roots[i].left) a.push(roots[i].left)
            if(roots[i].right) a.push(roots[i].right)
        }
        ans.push(aVal)
        roots = a
    }
    return ans
};

