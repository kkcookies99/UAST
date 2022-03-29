class Solution {
    func add(_ l1: ListNode?, _ l2: ListNode?, _ node: ListNode, _ needCarry: Bool) {
        let l1Next = l1?.next
        let l2Next = l2?.next
        let l1Value = l1?.val ?? 0
        let l2Value = l2?.val ?? 0
        var sum = l1Value + l2Value
        if needCarry {
            sum += 1
        }
        let (quotient, remainder) = sum.quotientAndRemainder(dividingBy: 10)
        node.val = remainder
        let nextNeedCarry = quotient == 1
        if l1Next !== nil || l2Next !== nil {
            node.next = ListNode()
            add(l1Next, l2Next, node.next!, nextNeedCarry)
        } else if nextNeedCarry {
            node.next = ListNode(1)
        }
    }

    func XXX(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        let head = ListNode()
        add(l1, l2, head, false)
        return head
    }
}

