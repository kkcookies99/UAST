 var XXX = function(root, targetSum) {
    if(!root) return false
    if(root.left==null&&root.right==null&&root.val==targetSum) return true
    return XXX(root.left,targetSum-root.val)||XXX(root.right,targetSum-root.val)
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


