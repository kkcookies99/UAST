 class Solution {
public:
    double find_n(vector<int>& arr1, vector<int>& arr2,int n){
        int k = n;
        int index_1 = 0, index_2 = 0;
        while(true){
            if(index_1 == arr1.size()) return arr2[index_2+k-1];
            if(index_2 == arr2.size()) return arr1[index_1+k-1];
            if(index_1+index_2==n-1) return min(arr2[index_2],arr1[index_1]);
            int new_1  = 0, new_2 = 0;
            if(index_1+k/2-1 < arr1.size()) new_1 = index_1+k/2-1;
            else new_1 = arr1.size()-1;
            if(index_2+k/2-1 < arr2.size()) new_2 = index_2+k/2-1;
            else new_2 = arr2.size()-1;
            if(arr1[new_1]>=arr2[new_2])
                index_2 = new_2+1;
            else 
                index_1 = new_1+1;
            k = n-index_1-index_2;
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

