var XXX = function(root, targetSum) {
    if(root===null){
        return false
    }
    let flag=false
    let preOrder=function(node,sum){
        if(node===null){
            return
        }
        sum+=node.val
        if(node.left===null&&node.right===null){
            if(targetSum===sum){
                flag=true
            }
        }
        preOrder(node.left,sum)
        preOrder(node.right,sum)
    }
    preOrder(root,0)
    return flag
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


