class Solution {
public:
    int XXX(vector<int>& height) {
        int n = sizeof( height ) / sizeof( height[0] );
        int sum=0,c=0;
        for(int i=0;i<n-1;i++){
            for(int o=i+1;o<=n;o++){
                if(height[i]<=height[o])c=height[i];
                else c = height[o];
                if (sum<c*(o-i))sum = c*(o-i);
                
            }
        }
        return sum;
    }
    
};

