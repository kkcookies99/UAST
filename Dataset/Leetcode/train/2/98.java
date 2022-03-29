class Solution {
    function XXX($l1, $l2) {
        
        $carry = 0;
        $dummy = $curr = new ListNode(0);
        
        while($l1 || $l2) {
            
            $val1 = $l1 ? $l1->val : 0;
            $val2 = $l2 ? $l2->val : 0;
            
            $sum   = $val1 + $val2 + $carry;
            $carry = intval($sum / 10);
            
            $curr->next = new ListNode($sum % 10);
            $curr = $curr->next;
            
            if ($l1) $l1 = $l1->next;
            if ($l2) $l2 = $l2->next; 
        }
        
        if ($carry) $curr->next = new ListNode($carry);
        
        return $dummy->next;
    }
}

