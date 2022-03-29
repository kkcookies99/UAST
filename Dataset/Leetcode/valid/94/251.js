 var XXX = function(root) {
    var ans = [];
    var stack = []
    while(root || stack.length){
        while(root){
            stack.push(root)
            root = root.left
        }
        root = stack.pop()
        ans.push(root.val)
        root = root.right
    }
    return ans
};

