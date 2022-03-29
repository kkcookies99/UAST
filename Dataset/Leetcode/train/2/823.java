 class Solution {
    func XXX(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        let head = ListNode.init(0)
        var p = l1,q = l2, curr = head;
        var carry = 0;
        while p != nil ||  q != nil {
            let a = p?.val ?? 0
            let b = q?.val ?? 0
            let c = a + b + carry
            carry = c / 10;
            curr.next = ListNode.init(c % 10)
            curr = curr.next!
            if p != nil {
                p = p?.next;
            }
            if q != nil{
                q = q?.next
            }
        }
        if carry > 0 {
            curr.next = ListNode.init(carry)
        }
        return head.next
    }
}

