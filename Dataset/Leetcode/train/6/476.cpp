 class Solution {
public:
    string XXX(string s, int numRows) {
        int size = s.size();
        if(size<numRows||numRows==1) return s;
        string ans="";
        string last_row="";
        int i=0;
        vector<int> nums;
        while(i<size){
            nums.emplace_back(i);//第一行
            ans+=s[i];
            if(i+numRows-1<size){
                nums.emplace_back(i+numRows-1);//最后一行
                last_row+=s[i+numRows-1];
            }
            i+=2*(numRows-1);
        }
        for(int j=1;j<numRows-1;j++){
            int k=0;
            while(k<nums.size()){
                if(nums[k]+j<size) ans+=s[nums[k]+j];
                if(nums[k+1]+numRows-1-j<size&&k+1<nums.size()) ans+=s[nums[k+1]+numRows-1-j];
                k+=2;
            }
        }
        ans+=last_row;
        return ans;
    }
};

