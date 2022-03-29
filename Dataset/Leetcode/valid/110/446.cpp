class Solution {
public:
    bool res = true;
    int height(TreeNode* root)
    {
        if(!root)  
        {
          cout<<"height:"<<0<<" "; return 0;  
        }
        
        int level = 0;
        queue<TreeNode*> queue;
        queue.push(root);
        while(queue.size())
        {
            int len = queue.size();
            for(int i =0;i<len;i++)
            {
                TreeNode* node = queue.front();
                queue.pop();
                if(node->left)  queue.push(node->left);
                if(node->right) queue.push(node->right);
            }
            level++;
        }
        cout<<"height:"<<level<<" ";
        return level;
    }
    void preorder(TreeNode* root)
    {
        cout<<root->val<<" ";
        if(!root)   return ;
        if(abs(height(root->left)-height(root->right))>1)
        res=false;
        if(root->left)  preorder(root->left);
        if(root->right) preorder(root->right);
        
    }
    bool XXX(TreeNode* root) {
        if(!root)   return true;
        preorder(root);
        return res;
    }
};

