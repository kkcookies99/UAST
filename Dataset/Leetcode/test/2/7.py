### 解题思路
累死了，看了半天用的是ListNode，大家看清楚

### 代码

```python
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def XXX(self, l1, l2):
        l1 = self.listnode2int(l1)
        l2 = self.listnode2int(l2)
        num = l1 + l2
        result = self.int2listnode(num)
        return result

    def listnode2int(self, listnode):
        result = ""
        now = listnode
        while now.next is not None:
            result = result + str(now.val)
            now = now.next
        result = result + str(now.val)
        result = result[::-1]
        result = int(result)
        return result

    def int2listnode(self,num):
        num  = str(num)
        # num = num[::-1]
        now = None
        for i in range(len(num)):
            if i == 0:
                now = ListNode(int(num[i]))
            else:
                tmp = ListNode(int(num[i]),now)
                now = tmp
        return now

