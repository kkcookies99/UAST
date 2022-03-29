 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int length=intervals.size();
        vector<vector<int>> result;
        if(length==0) return result;
        vector<nums> list;
        nums temp;

        for(int i=0;i<length;i++){
            temp.number=intervals[i][0];
            temp.tag=0;
            list.push_back(temp);
            temp.number=intervals[i][1];
            temp.tag=1;
            list.push_back(temp);
        }
        sort(list.begin(),list.end(),cmp);
        stack<int> comp;
        for(int i=0;i<2*length;i++){
            if(list[i].tag==0) comp.push(list[i].number);
            else{
                if(comp.size()==1) result.push_back({comp.top(),list[i].number});
                comp.pop();
            }
        }
        return result;
    }

private:
    struct nums{
        int number,tag;
    };

    static bool cmp(nums a,nums b){
        if(a.number!=b.number) return a.number<b.number;
        else return a.tag<b.tag;
    }
};

