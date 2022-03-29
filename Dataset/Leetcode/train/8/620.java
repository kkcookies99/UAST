 class Solution {

     /**
     * @param String $s
     * @return Integer
     */
    function XXX($s) {
        if($s == ''){
            return 0;
        }
        $byte = str_split($s);
        $flag = '';//判断关键位置是否为0
        $newS = '';
        $mark = 0;
        foreach($byte as $val){
            if($val === " " || $val === '-' || $val === '+'){
                if($val === " " && ($mark || $newS || $flag)){
                    break;
                }
                if(($val === '-' || $val === '+') && ($flag || $mark)){
                    break;
                }
                $flag = $val !== ' ' ? $val : '';
                //continue;
            }elseif(is_numeric($val)){
                if($newS || $val){
                    $newS .= $val;
                }
                $mark++;
            }else{
                break;
            }
        }
        
        $newS = $flag == '-' ? ($newS ? $flag.$newS : 0) : ($newS ? $newS : 0);
        $di = pow(2,31);
        if($newS >= (~$di + 1) && $newS < ($di - 1)){
            return $newS;
        }
        return $flag == '-' ? ~$di + 1 : $di - 1;
    }
}

