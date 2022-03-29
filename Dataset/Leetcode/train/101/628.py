 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def recursion(root,paths):
            if root!=None:
                paths.append(root.val)
                recursion(root.left,paths)
                recursion(root.right,paths)
            if root==None:
                paths.append('null')
            return paths

        def mirecursion(root,paths):#镜像递归
            if root!=None:
                paths.append(root.val)
                mirecursion(root.right,paths)#镜像说明遍历的次序和正常的次序不一样
                mirecursion(root.left,paths)
            if root==None:
                paths.append('null')
            return paths
        lisa,lisb=[],[]
        recursion(root,lisa)
        mirecursion(root,lisb)
        return lisa==lisb#如果对称说明两个列表的元素和左右树都是一样的

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


