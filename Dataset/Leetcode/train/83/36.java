class Solution {
    public ListNode XXX(ListNode head) {
        if (head == null){
            return null;
        }
        return parse(head, head.next);
    }

    private ListNode parse(ListNode parentNode,ListNode childNode){
        if (childNode == null){
            return parentNode;
        }
        if (parentNode.val == childNode.val){
            if (childNode.next != null){
                return parse(parentNode,childNode.next);
            }
            return childNode;
        } else {
            parentNode.next = parse(childNode,childNode.next);
            return parentNode;
        }
    }
}

