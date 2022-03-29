 class Solution:
    def XXX(self, head: ListNode, n: int) -> ListNode:
        
        hash_map = dict()
        save = head
        i = 0
        while head:
            hash_map[i] = head
            head = head.next
            i += 1
        length = len(hash_map)
        if length-n-1>=0: pre = hash_map[length-n-1]
        else: return save.next
        post = pre.next.next
        pre.next = post
        return save

