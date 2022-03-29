class Solution:
    def XXX(self, head: ListNode) -> ListNode:
        if(head == None):
            return(None)
        store_head, node_Pre = head, head
        while(head.next != None):
            if(head.val != node_Pre.val):
                node_Pre = head
                head = head.next
            else:
                node_Pre.next = head.next
                head = head.next
        if(head.val != node_Pre.val):
            node_Pre = head
            head = head.next
        else:
            node_Pre.next = head.next
            head = head.next
        return(store_head)

