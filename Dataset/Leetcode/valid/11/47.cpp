class Solution {
public:
    int XXX(vector<int>& height) {
    int res=0;
    vector<int> tmp;
    int begin=0;
    int l=0;
    int end=height.size()-1;
    for(; begin<end ;){
        int begin1=begin;
        int end1=end;
        int num=0;
        l=end-begin;
        if (height[begin1]>=height[end1]){
            num=l*height[end];
            end--;
        }
        if (height[begin1]<height[end1]){
            num=l*height[begin];
            begin++;
        }
        tmp.push_back(num);
    }
    for (int i = 0; i < tmp.size(); ++i) {
        if (tmp[i]>=res){
            res=tmp[i];
        }
    }
    return res;
}
};

