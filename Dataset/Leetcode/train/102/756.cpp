 class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> Result;
        if(root==NULL)
        {
            return Result;
        }
        Result = Cengci(root);
        return Result;
    }

    vector<vector<int>> Cengci(TreeNode* root)
    {
        vector<vector<int>> Result;
        queue<TreeNode*> q;
        queue<TreeNode*> qtmp;
        cout<<root->val<<endl;
        vector<int> a(1,root->val);
        Result.push_back(a);
        q.push(root);
        while(q.empty()==false)
        {
            TreeNode *tmp = q.front();
            if(tmp->left!=NULL)
            {
                cout<<tmp->left->val<<" ";
                qtmp.push(tmp->left);
            }
            if(tmp->right!=NULL)
            {
                cout<<tmp->right->val<<" ";
                qtmp.push(tmp->right);
            }
            q.pop();
            if(q.empty()==true&&qtmp.empty()==false)
            {
                vector<int> Myvec;
                TreeNode* mytmp;
                while(qtmp.empty()==false)
                {
                    mytmp = qtmp.front();
                    Myvec.push_back(mytmp->val);
                    q.push(mytmp);
                    qtmp.pop();
                }
                cout<<"1 ceng xun huan wan bi"<<endl;
                Result.push_back(Myvec);
            }
        }
        return Result;
    }
};

