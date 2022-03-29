 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
    
        vector<vector<int>> v;
        
        if(numRows<=0) return v;
        triangle(numRows,v);
        return v;
    }

    void  triangle(int n,vector<vector<int>> &v){

        if(n==1){
            vector<int> t1 = {1};
            v.push_back(t1);
            return;
        }
        if(n==2){
            vector<int> t1 = {1};
            vector<int> t2 = {1,1};
            v.push_back(t1);
            v.push_back(t2);
            return;
        }
        //递归调用,生成前n行元素
        triangle(n-1,v);

        //插入第n行元素
        vector<int> temp;
        temp.push_back(1);
        for(int i=0;i<n-2;i++)
            temp.push_back(v[n-2][i]+v[n-2][i+1]);
        temp.push_back(1);
        
        v.push_back(temp);
        return ;
    }
};

