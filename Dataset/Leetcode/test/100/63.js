 var XXX = function(p, q) {
 let preorderTraversal = function (root) {
    let res = [];
    if(!root) return res;
    let preorderHelper = (root) =>{
      if( !root) return
      console.log(root)
      res.push(root.val)
      preorderHelper(root.left) 
      preorderHelper(root.right)
    }
    res.push(root.val)
    preorderHelper(root.left)
    preorderHelper(root.right)
    return res
  }
  return preorderTraversal(p).toString()===preorderTraversal(q).toString()
};
let p = new TreeNode(1)
p.left = new TreeNode(1)


let q = new TreeNode(1)
q.left = new TreeNode(null)
q.right = new TreeNode(1)
console.log(XXX(p,q))

