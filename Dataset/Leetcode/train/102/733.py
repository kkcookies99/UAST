 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
         if root is None:
             return []
         queue = [root,]
         output = []
         while len(queue)!=0:
             size = len(queue)
             list1 = []
             while size > 0:
                 temp = queue[0]
                 del queue[0]
                 if temp:
                    list1.append(temp.val)
                 if temp.left:
                    queue.append(temp.left)
                 if temp.right:
                    queue.append(temp.right)
                 
                 size = size -1
             output.append(list1)

         return output

