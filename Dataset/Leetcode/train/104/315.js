var XXX = function(root) {
    let max = 0;
    let cur = 0;

    const deep = function(root, cur){
        if(!root){
            max = Math.max(max, cur);
            cur = 0;
            return;
        }else{
            cur++;
        }

        deep(root.left, cur);
        deep(root.right, cur);
    }

    deep(root, cur);

    return max;
};

