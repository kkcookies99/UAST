class Solution {
public:
    
    //深度优先解决，sumCurrent为到当前节点之前的权值和
    bool DFS(TreeNode* root,int targetSum,int sumCurrent){
        // 如果是空结点，返回假
        if(!root) return false;
       //加上当前节点的权值
        sumCurrent+=root->val;
      //如果是叶子结点，说明路径到头，又正好是targetSum，则存在这样的路径
        if(!root->left&&!root->right&&sumCurrent==targetSum) return true;
        
        //否则保存一下，准备递归，因为可能左子树找不到，推出来的时候右子树要用当前节点的sumCurrent;
        int temp=sumCurrent;
        if(DFS(root->left,targetSum,sumCurrent)) return true;
        
        //左子树没找到，退出来了
       
        sumCurrent=temp;
        //在右子树再找
        if(DFS(root->right,targetSum,sumCurrent)) return true;
        //找不到就真没了
        return false;
    }
    bool XXX(TreeNode* root, int targetSum) {
          return DFS(root,targetSum,0);
    }
    
};

