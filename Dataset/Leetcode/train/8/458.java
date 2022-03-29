 class Solution {

    /**
     * @param String $s
     * @return Integer
     */
    function XXX($s) {
        $max = pow(2, 31);
        $v = intval(str_replace('e','x', $s),10);
        if (-$max <= $v && $v <= $max - 1) {
            return $v;
        } else {
            return $v > 0 ? $max - 1 : -$max;
        }
    }
}

