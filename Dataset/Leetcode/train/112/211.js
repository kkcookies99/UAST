 var XXX = function(root, targetSum) {
    function dfs(root, total) {
        if(!root) return false
        if(!root.left && !root.right && (total + root.val) === targetSum)  return true
        return dfs(root.left, total + root.val) || 
            dfs(root.right, total + root.val)
    }
    return dfs(root, 0)
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


