 class Solution {
public:

    bool XXX(TreeNode* root)
    {   
    return MirrorT (root,root);
    }

    bool MirrorT (TreeNode *p,TreeNode *q)         
        
        {
            if (!p && !q){return 1;}
            if (!p || !q){return 0;}
            if (p -> val == q -> val) {return MirrorT (p -> left,q -> right) && MirrorT (p -> right,q -> left);} 
            return 0;
        }

};

