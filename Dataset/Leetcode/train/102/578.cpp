class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> a={};
        if (root==NULL)
           return a;
        queue<TreeNode*> qr={};
        qr.push(root);
        int len=qr.size();
        while(!qr.empty())
        {
            vector<int> tem;
            for(int i=0;i<len;i++)
            { 
              TreeNode* node=qr.front(); 
              tem.push_back(node->val);
              if(node->left)
                qr.push(node->left);
              if(node->right)
                qr.push(node->right);
              qr.pop();
            }
            len=qr.size();
             a.push_back(tem);
        }
        return a;
    }
};

