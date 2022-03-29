 class Solution {

    /**
     * @param String $s
     * @return String
     */
    function XXX($s) {
        $len = strlen($s);
        $max = '';
        
        for($i = 0;$i<$len;$i++){ //正向 逐个字符循环
            $l = $i;
            $i2=$len-1;
            if(strlen($max)>($len-$i)){
                break;
            }
            for(;$i2>=0;$i2--){ //反向 逐个字符循环
                $r = $i2;
                $match = true;
                while($r>=$l){  //如果匹配则继续逐个向中位字符匹配
                    if($s[$l]==$s[$r]){
                        $r--;
                        $l++;
                    }else{
                        $match = false;
                        $l = $i;
                        break;
                    }    
                }
                if($match){
                    break;
                }
            }
            if($l>$i){
                $tmp = substr($s,$i,$i2-$i+1);
                strlen($tmp) >= strlen($max) && $max = $tmp;
            }
        }
        
        return $max;
    }
}

