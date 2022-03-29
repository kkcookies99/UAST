 class Solution {
public:
     void wishgoleft(stack<TreeNode*>&s) {
         while(TreeNode* p=s.top()){//路径上的前一节点
             if(p->left){//能向左则左
                 if(p->right){
                   s.push(p->right);//压入当前路径节点的右子树
                   p->right->val+=p->val;//更新路径值
                 }
                 s.push(p->left);
                 p->left->val+=p->val;
             }
             else{//不能左，则向右
                      if(p->right){
                        s.push(p->right);
                        p->right->val+=p->val;
                      }else break;//叶节点 退出
                  }
         }
     }
    bool XXX(TreeNode* root, int targetSum) {
        if(!root)return false;
         stack<TreeNode*> s;
         s.push(root);
         while(!s.empty()){
             if(s.top()->left!=root&&s.top()->right!=root){//对路径上节点的右子树进行遍历
                 wishgoleft(s);//刚至叶节点
                 if(s.top()->val==targetSum)return true;//判断是否与给定值相等
             }
             root=s.top();s.pop();//后续遍历意义下的当前节点
         }
         return false;
    }
};

