 class Solution {

    /**
     * @param Integer $x
     * @return Boolean
     */
    function XXX($x) {
        if ($x < 0) return false;
        $rev = strrev($x);
        if ($rev == $x) return true;
        else return false;
    }
}

