 class Solution {

    /**
     * @param String $s
     * @return String
     */
    function XXX($s) {
        $start = 0;
        $maxlen = 0;
        if(strlen($s)<=1){
            return $s;
        }

        for($i=0;$i<strlen($s)-1;$i++){
            $len = 1;
            $st = $i;
            $ed = $i;

            while($ed<strlen($s) && $s[$i]==$s[$i+1]){
                $len++;
                $ed+=1;
                $i++;
            }

            while($st>0 && $ed<strlen($s) && $s[$st-1]==$s[$ed+1]){
                $len+=2;
                $st--;
                $ed++;
            }

            if ($len>$maxlen){
                $maxlen = $len;
                $start = $st;
            }
        }
        return substr($s,$start,$maxlen);
    }


}

