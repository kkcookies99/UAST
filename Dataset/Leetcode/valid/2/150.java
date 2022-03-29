class Solution {
    /**
     * @param ListNode $l1
     * @param ListNode $l2
     * @return ListNode
     */
    function XXX($l1, $l2) {
        $result = new ListNode(0);
        $cursor = $result;
        $sum = 0;

        while ($l1 != null || $l2 != null) {
            $l1Val = $l1 != null ? $l1->val : 0;
            $l2Val = $l2 != null ? $l2->val : 0;
            $tmp = $l1Val + $l2Val + $sum;
            $sum = $tmp / 10;
            $sumNode = new ListNode($tmp % 10);
            $cursor->next = $sumNode;
            $cursor = $sumNode;
            if ($l1 != null) {
                $l1 = $l1->next;
            }
            if ($l2 != null) {
                $l2 = $l2->next;
            }
        }

        if ($sum >= 1) {
            $cursor->next = new ListNode(1);
        }

        return $result->next;
    }
}

