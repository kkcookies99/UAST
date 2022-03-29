 vector<int> XXX(vector<int>& nums, int target) {

    vector<int>a;

    std::map<int,int>e;

    int x=nums.size();

    for(int i=0;i<x;i++){

        e[nums[i]]=i;

    }

    for(int i=0;i<x;i++){

        if(e.count(target-nums[i])&&e[target-nums[i]]!=i){

            a.push_back(i);

            a.push_back(e[target-nums[i]]);

            return a;

        }

    }      

    return a;

}

