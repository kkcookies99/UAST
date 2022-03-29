 class Solution {
    function XXX($l1, $l2) {
        //初始化，第一个节点
        $resList = new ListNode(0);
        $n = $resList;
        $flag = 0;//进位标志位
        //循环体
        while($l1 || $l2){
            //考虑进位
            $add1 = $l1->val ?? 0;
            $add2 = $l2->val ?? 0;
            $add = $add1 + $add2 + $flag;
            if ($add >= 10){
                $add -= 10;
                $flag = 1;//进位标识符
            }else{
                $flag = 0;
            }
            $n->next = new ListNode($add);
            $n = $n->next;
            $l1 = $l1->next;
            $l2 = $l2->next;
        }
        if($flag == 1){
            $n->next = new ListNode(1);
        }
        return $resList->next;
    }
}

