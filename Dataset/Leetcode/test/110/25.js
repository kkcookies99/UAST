var XXX = function(root) {
    let flag=1
    function fun1(root){
        if(root==null){
            return 1
        }
         let left=fun1(root.left)
        let right= fun1(root.right)
        if(Math.abs(left-right)>1){
            flag=0
        }
           return Math.max(left,right)+1
    }
    fun1(root)
   return !!flag
};

