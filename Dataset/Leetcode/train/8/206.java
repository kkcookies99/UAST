class Solution {

    /**
     * @param String $str
     * @return Integer
     */
    function XXX($str) {
        $str = trim($str);
        $has = preg_match('/^[+-]?\d+/', $str, $res);
        if ($has) {
            $num = $res[0];
            if ($num < 2**31* -1) {
                return 2**31* -1;
            }
            if ($num > 2**31 - 1) {
                return 2**31 - 1;
            }
            return $num * 1;
        }
        return 0;
    }
}

