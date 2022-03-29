 var XXX = function(root) {
// 1.这一部是一个节点要做的事即框架
    function getHeight(node){        //求二叉树最大深度
        if(node===null){
            return 0;
        }
        return Math.max(getHeight(node.left),getHeight(node.right))+1;
    }
    if (root === null) {
      return true;
    }

//2这一部分是调用框架
    return XXX(root.left) && XXX(root.right)&&       //这里的两个函数&&起来是为了减少因一个节点不满足而不必要的后续判断
           Math.abs(getHeight(root.left)-getHeight(root.right))<2;
};

