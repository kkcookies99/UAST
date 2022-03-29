 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        node_count = 0
        h_1=h_2=h_3=tail = head
        while tail:
            node_count += 1
            tail = tail.next
            if node_count <= n:#如果当前的链表长度小于等于n的值则不停将tail后移
                continue
            h_2 = h_2.next#链表长度大于n时，h_2开始后移，
            if node_count - n > 1:#链表长度与n的插等于1时h_1还不需要移动，大于1时h_1需要开始不停的后移
                h_1 = h_1.next
        if node_count == n:
            h_3 = h_3.next
        else:
            h_1.next = h_2.next
        return h_3

