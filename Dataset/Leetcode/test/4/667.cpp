 class Solution {
public:
    double find_n(vector<int>& arr1, vector<int>& arr2,int n){
        if(arr1.empty()) return arr2[n-1];
        if(arr2.empty()) return arr1[n-1];
        if(n==1) return min(arr1[0],arr2[0]);
        int index_x = n/2-1;
        int index_y = n/2-1;
        if(arr1.size()<n/2) index_x = arr1.size()-1;
        if(arr2.size()<n/2) index_y = arr2.size()-1;
        if(arr1[index_x]<=arr2[index_y]) {
            vector<int> tmp(arr1.begin()+index_x+1,arr1.end());
            return find_n(tmp,arr2,n-index_x-1);
        }else{
            vector<int> tmp(arr2.begin()+index_y+1,arr2.end());
            return find_n(arr1,tmp,n-index_y-1);
        }
            
    }
    double XXX(vector<int>& arr1, vector<int>& arr2) {
        // write code here
        int sum = arr1.size()+arr2.size();
        if(sum%2) 
            return find_n(arr1,arr2,sum/2+1);
        else 
            return (find_n(arr1,arr2,sum/2)+find_n(arr1,arr2,sum/2+1))/2;
    }
};

