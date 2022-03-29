 var XXX = function(root) {
    let res=[];
    preOrder(root,0);
    return res;
    function  preOrder(root,level){
        if(root){
            if(res[level]) res[level].push(root.val)
            else res[level]=[root.val];
            preOrder(root.left,level+1)
            preOrder(root.right,level+1)
        }
    }
};

