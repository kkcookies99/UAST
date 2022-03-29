 var XXX = function(root) {
   var result=[];
   var stack=[];
   while(stack.length||root){
        if(root){
            stack.push(root);
            root = root.left
        }else{
            root=stack.pop();
            result.push(root.val);
            root = root.right;
        }
    }
    return result;
};

