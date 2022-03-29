 class Solution {
public:
     
    vector<int> XXX(TreeNode* root) {
        vector<int> tree;
        if(root==nullptr)
            return tree;
        stack<TreeNode*> s;
        s.push(root);
        while(s.size())
        {
            TreeNode* p=s.top();
            s.pop();
            if(p->right==nullptr&&p->left==nullptr)
                tree.push_back(p->val);
            if(p->right!=nullptr&&p->left==nullptr)
            {
                s.push(p->right);
                s.push(p);
                p->right=nullptr;
            }
            if(p->right==nullptr&&p->left!=nullptr)
            {
                s.push(p);
                s.push(p->left);
                p->left=nullptr;
            }
            if(p->right!=nullptr&&p->left!=nullptr)
            {
                s.push(p->right);
                s.push(p);
                s.push(p->left);
                p->right=nullptr;
                p->left=nullptr;
            }
            
        }
        return tree;
    }
  
};

