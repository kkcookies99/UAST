class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        container = set()
        curr = head
        prev = head
        while curr is not None: 
            if curr.val not in container:
                # 如果container容器中没有当前这个元素，把当前元素添加到集合中，并把当前节点暂存为prev
                container.add(curr.val)
                prev = curr
            else:
                # 将上一个节点的next指向当前节点的next
                prev.next = curr.next
            curr = curr.next

        return head

