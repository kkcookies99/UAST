 class Solution {

    /**
     * @param ListNode $l1
     * @param ListNode $l2
     * @return ListNode
     */
    function XXX($l1, $l2) {
        if(empty($l1) || empty($l2)){
            return [0];
        }
        $res = array_reverse(str_split( strrev(implode('', $l1)) + strrev(implode('', $l2))));
        return $res;
    }
}

