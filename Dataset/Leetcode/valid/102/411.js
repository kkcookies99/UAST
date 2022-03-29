var XXX = function(root) {
     let result = []
     if (root === null) return result
    
     dfs(root, result, 0)
     return result
 }

 function dfs(node, result, level) {

     // 返回终止条件
     if (node === null) return
     // 若当前 level 是 1，那么对应层级是 1，result 应该有(length) 2 个子数组。若 小于，则说明需要加一个子数组
     if (level > result.length - 1) result.push([])

     result[level].push(node.val)


     if (node.left !== null) {
         dfs(node.left, result, level + 1)
     }

     if (node.right !== null) {
        dfs(node.right, result, level + 1)
     }
 }

