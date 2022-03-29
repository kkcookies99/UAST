class Solution {
    public int XXX(TreeNode root) {
        return getNum(root,0);
    }
    public int getNum(TreeNode temp,int num){
        if(temp ==null){
            return num;
        }
        num++;  //此结点存在 加1；
        int num1=getNum(temp.left,num);  //向左递归；
        int num2=getNum(temp.right,num);  //向右递归；      
        return num1>num2 ? num1 : num2;
    }
}

