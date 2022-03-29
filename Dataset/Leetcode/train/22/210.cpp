 class Solution {
public:
    vector<string> XXX(int n) {
        string path;
        vector<string>ans;
        int size=0,left=0,right=0;
        int max=n*2;
        trace(size,max,left,right,path,ans);
        return ans;

    }

    void trace(int &index,int &pathlength,int &left,int &right,string &path,vector<string>&ans){
        if(index==pathlength&&left==right)
        {
            ans.push_back(path);
            return;
        }
        if(left<pathlength/2){
        path+='(';
        index+=1;
        left+=1;
        trace(index,pathlength,left,right,path,ans);
        --index;
        --left;
        path.pop_back();}
        if(right<pathlength/2&&right!=left){
        path+=')';
         index+=1;
         right+=1;
        trace(index,pathlength,left,right,path,ans);
        --index;
        --right;
        path.pop_back();}

        return;

    }
};

