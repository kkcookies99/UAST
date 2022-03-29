 class Solution {
    /****  YY-帆S  ****/
    function XXX($root) {
        $res = [];                  //结果数组
        $stack = [];				//堆栈[节点（对象），是否存入结果数组（bool）]
        $stack[] = [$root,false];	//初始化堆栈，保存根节点
        while (!empty($stack)) {
            $node = array_pop($stack);             //弹出栈顶元素
            $p = $node[0];                         //0下标为节点对象
            if($node[1]){                          //1下标为是否存入结果数组，进行判断
                $res[] = $p->val;                  //将节点的值存入结果数组
            }else{
                if($p->right)                      //访问右子树
                    $stack[] = [$p->right,false];  //压入栈中，初始为不打印
                $stack[] = [$p,true];			   //将该节点设置为可打印
                if($p->left)                       //访问左子树
                    $stack[] = [$p->left,false];   //压入栈中，初始为不打印
            }
        }
        return $res;
    }
}

