bool XXX(struct TreeNode* root, int targetSum){
    static int sum = 0;
    static bool flag = 0;
    static int cnt = 0;
    if(cnt == 0){//用于多次调用时的初始化
        sum = 0;
        flag = 0;
    }
    if(!root)
        return flag;
    else{
        sum += root->val;
        if(sum == targetSum && !root->left && !root->right)
            flag = 1;
        cnt ++;
        XXX(root->left, targetSum);
        XXX(root->right, targetSum);    
        sum -= root->val;
        cnt --;
    }
    return flag;
}
//测试时这个题是主函数多次调用这个函数而不是多次执行程序，所以应用静态变量或者全局变量时在函数入口处应该重新初始化

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


