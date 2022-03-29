 var XXX = function(p, q) {
    var diff=function(node1,node2){
        if(node1==null&&node2==null)
            return true;
        if((node1===null&&node2!=null)||(node1!==null&&node2===null)||(node1.val!=node2.val)){
            return false;
        }
        return diff(node1.left,node2.left)&&diff(node1.right,node2.right);
    }
    return diff(p,q);
};

