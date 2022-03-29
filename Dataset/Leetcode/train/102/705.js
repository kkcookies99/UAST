 var XXX = function(root) {
    let answer = []
    re = function (root, curr){
        if(!root) return
        if(answer[curr]) {//check cache
            answer[curr].push(root.val)
        }else{//create
            answer[curr] = [root.val]
        }
        if(root.left){re(root.left,curr + 1)}
        if(root.right){re(root.right,curr + 1)}
    }
    
    re(root,0)
    return answer    
};

