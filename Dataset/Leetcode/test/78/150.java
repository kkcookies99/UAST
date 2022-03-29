class Solution {
    private $res = [];
    private $len,$nums;
 
    /**
     * @param Integer[] $nums
     * @return Integer[][]
     */
    function XXX($nums) {
        $this->len = count($nums);              //使其成为成员变量
        $this->nums = $nums;
        if($this->len == 0) return $this->res;  //初始化判断
        $this->findSub(0,[]);                   //递归回溯记录结果数组
        return $this->res;
    }
 
    /**
     * [递归回溯记录结果数组]
     * @param  [type] $start [开始下标]
     * @param  [type] $path  [暂存的结果数组]
     */
    private function findSub($start,$path){
        $this->res[] = $path;                   //记录子集，每次递归都是一个新的子集
        for($i = $start;$i<$this->len;++$i){
            $path[] = $this->nums[$i];          //回溯递归过程
            $this->findSub($i+1,$path);
            array_pop($path);
        }
    }
}

