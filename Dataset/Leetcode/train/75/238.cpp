class Solution {
public:
    void XXX(vector<int>& nums) { 
        int length =nums.size();
        vector<int> copy(length);
        int index1=0,index2=length-1;
        for(int i=0;i<length;i++){
            switch(nums[i]){
                case 0: copy[index1]=0;
                        index1++;
                        break;
                case 2: copy[index2]=2;
                        index2--;
                        break;
            }
        }
        while(index1<=index2){
            copy[index1]=1;
            index1++;
        }
        for(int i=0;i<length;i++){
            nums[i]=copy[i];
        }
    }
};

