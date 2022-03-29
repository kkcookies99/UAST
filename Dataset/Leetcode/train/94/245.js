 var XXX = function(root) {
    if (!root) return [] 
    let res=[] 
    inorder(root,res) 
    return res 
}; 
let inorder = (node,res)=>{
    if(node.left!= null) inorder(node.left,res)  
    res.push(node.val) 
    if(node.right!= null) inorder(node.right,res)  
}

