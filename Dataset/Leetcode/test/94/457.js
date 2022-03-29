 var XXX = function(root) {
    let a=[];
    const b=(n)=>{
        if(!n){return[];}
        b(n.left);
        a.push(n.val);
        b(n.right);
    }
    b(root);
    return a;
};

