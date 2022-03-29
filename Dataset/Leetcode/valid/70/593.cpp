class Solution {
public:
    vector<vector<int>> arr;
    vector<vector<int>> juzhen_mul(vector<vector<int>> a,vector<vector<int>>b){
        int a1,a2,a3,a4;
        a1=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        a2=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        a3=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        a4=a[1][0]*b[0][1]+a[1][1]*b[1][1];
        return{{a1,a2},{a3,a4}};
    }
    vector<vector<int>> QuickPow(int n){
        if(n==1) return arr;
        if(n%2==0){
            vector<vector<int>> ans=QuickPow(n/2);
            return juzhen_mul(ans,ans);
        }
        else{
            vector<vector<int>> ans=QuickPow(n/2);
            return juzhen_mul(arr,juzhen_mul(ans,ans));
        }
    }
    int XXX(int n) {
        if(n<2) return 1;
        arr.push_back({1,1});
        arr.push_back({1,0});
        vector<vector<int>> tmp=QuickPow(n-1);
        return tmp[0][0]+tmp[0][1];
    }
};

