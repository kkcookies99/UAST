class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int> > awnser;
        if(!root){
            return awnser;
        }
        queue<TreeNode*> queue0;
        queue0.push(root);
        vector<int> ls;
        int* count=new int[1000000];
        count[0]=1;
        int i=0;
        while(!queue0.empty()){
            //cout<<"test_queue_size:"<<queue0.size()<<endl;
            TreeNode* t=queue0.front();
            queue0.pop();
           // cout<<t->val<<endl;
            ls.push_back(t->val);
            if(t->left!=NULL){
                queue0.push(t->left);
                if(count[i+1]<0)count[i+1]=0;
                count[i+1]++;
            }
            if(t->right!=NULL){
                queue0.push(t->right);
                if(count[i+1]<0)count[i+1]=0;
                count[i+1]++;
            }
            if(ls.size()==count[i]){
            awnser.push_back(ls);
            ls.clear();
            i++;
            }
        }
        //cout<<count[0]<<" "<<count[1]<<" "<<count[2]<<endl;
        return awnser;
    }
};

