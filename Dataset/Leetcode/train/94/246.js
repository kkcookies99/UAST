 var XXX = function(root) { 
    let res=[]
    let stack=[]
    let curr = root
    while(stack.length || curr != null){
       if(curr != null){
           stack.push(curr)
           curr = curr.left
       }else{
           curr = stack.pop()
           res.push(curr.val)
           curr = curr.right
       }
    }
    return res
};

