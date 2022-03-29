 var XXX = function(root) {
    //节点为空或节点没有左右两个子节点，都是平衡二叉树
    if(!root) return true;
    //root不是null，才会执行下面的判断，所以不会报错
    if(!root.left && !root.right) return true;
    
    //一个二叉树节点的左右两个子树的高度，遍历所有节点
    var leftDep = getTreeHeight(root.left);
    var rightDep = getTreeHeight(root.right);
    var depth = Math.abs(leftDep - rightDep);
    let bool = depth > 1?false:true;
    //如果得知某个节点的左右两个字数的绝对值大于一，那么整个树就不是平衡二叉树，return跳出遍历
    //如果某个节点是平衡二叉树，继续遍历其他节点，要return这个布尔值
    //左右节点的值要写成且的形式，要是两个return后面的就不执行
    if(bool){
       return XXX(root.left) && XXX(root.right);
    }else{
        return false;
    }
};

function getTreeHeight(root){
    //终止条件：节点无，每次搜索到头深度就是0
    if(root == null){
        return 0; 
    }
    //累加下一层的深度要加1
    var leftDepth = getTreeHeight(root.left) + 1;
    var rightDepth = getTreeHeight(root.right) + 1;
    //返回深度
    return Math.max(leftDepth,rightDepth);  
};

