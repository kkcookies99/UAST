 var XXX = function(root) {
    if(root == null){
       return true
    }
    let queue = [root]
    while(queue.length>0){
        let node = queue.shift()
        if(node.left!=null){
           if(node.val > node.left.val){
             queue.push(node.left)   
           }else{
             return false
           }
        }
        if(node.right != null){
           if(node.val < node.right.val){
             queue.push(node.right)   
           }else{
             return false
           }
        }
    }
    return true
};

