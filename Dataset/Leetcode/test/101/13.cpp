 class Solution {
public:
    bool XXX(TreeNode* root) {
        queue<TreeNode*>que;
        if(root!=NULL)que.push(root);
        while(!que.empty())
        {
            int size=que.size();
            char st[size];
            for(int i=0;i<size;i++)
            {
                TreeNode* node=que.front();
                que.pop();
                if(node!=NULL){st[i]=node->val;}else{st[i]='a';}
                if(node!=NULL)
                {
                    if(node->left){que.push(node->left);}else{que.push(NULL);}
                    if(node->right){que.push(node->right);}else{que.push(NULL);}
                }
            }
            if(size!=1)
            {
                for(int i=0;i<size/2;i++)
                {
                    if(st[i]!=st[size-i-1])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
};


