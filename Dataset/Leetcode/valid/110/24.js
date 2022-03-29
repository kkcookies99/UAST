var XXX = function(root) {
   if(!root){
       return true
   }
   if(Math.abs(maxDepth(root.left) - maxDepth(root.right) ) > 1 ) return false
   return XXX(root.left) && XXX(root.right);
};

function maxDepth (root){
    if(root === null){
        return 0;
    }
    let leftDepth = maxDepth(root.left);
    let rightDepth = maxDepth(root.right);
    return Math.max(leftDepth,rightDepth) + 1;
}

