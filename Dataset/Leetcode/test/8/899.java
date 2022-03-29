 class Solution {

    /**
     * @param String $str
     * @return Integer
     */
    function XXX($str) {
        $str = trim($str);
        if(preg_match('/^(\+|-)?[\d]+/',$str,$match)){
            if($match[0] > 2147483647) return 2147483647;
            if($match[0] < -2147483648) return -2147483648;
            return (int) $match[0];
        }else{
            return 0;
        }
    }
}

