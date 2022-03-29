class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int n=matrix.size(),t,n0=n;
        int x,y;

        for(int i=0;i<n0/2;i++){
            for(int j=i;j<n0-1-i;j++){
                int x0=i,y0=j;
                x=j;y=n-1+i;
                while(1){
                    t=matrix[x0][y0];
                    matrix[x0][y0]=matrix[x][y];
                    matrix[x][y]=t;
                    int x_old=y-i,y_old=n-1-(x-i);
                    x=x_old+i;y=y_old+i;
            
                    if(x==x0&&y==y0)
                        break;  
                }
            }
            n=n-2;
        }
        
    }
};

