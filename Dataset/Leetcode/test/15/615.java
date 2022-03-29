 class Solution {
/**
     * @param Integer[] $nums
     * @return Integer[][]
     */
    function XXX($nums)
    {
        $ret = [];
        $nums = $this->sortArr($nums);
        $len = count($nums);
        // a+b+c=0
        // a=$nums[$i] b=nums[left] c=$nums[right]
        foreach ($nums as $i => $num) {
            if ($num > 0) {#第一个都大于0 后面的数更不可能结果为0了
                return $ret;
            }
            if ($i > 0 && $num == $nums[$i - 1]) {
                continue;#去重
            }
            $left = $i + 1;
            $right = $len - 1;
            while ($left < $right) {
                if ($num + $nums[$left] + $nums[$right] > 0) {
                    $right--;
                } elseif ($num + $nums[$left] + $nums[$right] < 0) {
                    $left++;
                } else {
                    $ret[] = [$num, $nums[$left], $nums[$right]];
                    //去重
                    while ($left < $right && $nums[$left] == $nums[$left + 1]) {
                        $left++;
                    }
                    while ($left < $right && $nums[$right] == $nums[$right - 1]) {
                        $right--;
                    }
                    //找到后 缩小范围
                    $left++;
                    $right--;
                }
            }
        }

        return $ret;
    }

    //计数排序
    protected function sortArr($arr)
    {
        $counter = [];
        $min = $max = $arr[0];
        foreach ($arr as $value) {
            if (!isset($counter[$value])) $counter[$value] = 0;
            $counter[$value]++;
            $max = $value > $max ? $value : $max;
            $min = $value < $min ? $value : $min;
        }
        $ret = [];
        for ($i = $min; $i <= $max; $i++) {
            while (isset($counter[$i]) && $counter[$i] > 0) {
                $ret[] = $i;
                $counter[$i]--;
            }
        }
        return $ret;
    }
}

