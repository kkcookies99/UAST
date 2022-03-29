 class Solution {
public:
    string XXX(string s, int numRows) {
        int l=s.size();
        int t=0;
        if(numRows==1){
            return s;
        }
        int sum;
        if(l<(2*numRows-2)){
            sum=1+(l%numRows);
        }else{
            sum=(l/(2*numRows-2))*(numRows-1);
            if((l-(l/(2*numRows-2))*(numRows-1))<=numRows){
                sum++;
            }else{
                sum=sum+((l-(l/(2*numRows-2))*(numRows-1))-numRows)+1;
            }
        }
        vector<vector<char>>ans(numRows,vector<char>(sum));
        vector<vector<int>>visited(numRows,vector<int>(sum,0));
        int i=0,j=0;
        int fx=0;
        int a[2][2]={{1,0},{-1,1}};
        for(int k=0;k<l;k++){
            ans[i][j]=s[k];
            visited[i][j]=1;
            int xi=i+a[fx][0];
            int xj=j+a[fx][1];
            if(xi<0||xj<0||xi>=numRows||xj>=sum||visited[xi][xj]==1){
                fx=(fx+1)%2;
                i+=a[fx][0];
                j+=a[fx][1];
                continue;
            }
            i=xi;j=xj;
        }
        string res="";
        for(int m=0;m<numRows;m++){
            for(int n=0;n<sum;n++){
                if(visited[m][n]==1){
                    res+=ans[m][n];
                }
            }
        }
        return res;
    }
};

