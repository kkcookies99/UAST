 class Solution {
    function XXX(Object $l1, Object $l2) {
        $vv0 = new class{public $val = 0;};
        $vv1 = new class{public $val = 1;};
        $result = clone $vv0;
        $tmp = &$result;
        while (true) {
            $tmp->val += ($l1->val??0) + ($l2->val??0);
            if ($tmp->val >= 10) {
                $tmp->val -= 10;
                $tmp->next = clone $vv1;
            }
            if ($l1 !== null) $l1 = $l1->next??null;
            if ($l2 !== null) $l2 = $l2->next??null;
            if ($l1===null && $l2===null) break;
            if (!isset($tmp->next)) $tmp->next = clone $vv0;
            $tmp = &$tmp->next;
        }
        return $result;
    }
}

