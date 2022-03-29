 class Solution {
public:
    //算法是数学的表示；我们先阐述一下基本的算法过程；
    //本题使用分治法；
    //在区间[l，r]上维护四个值，分别是lsum(以l为起点的最大字段和)；rsum(以r为终点的最大字段和)；isum(l，r上的所有和)，ssum(l，r上的最大字段和)
    //[l,r]分为[l,m]和[m+1,r]下面就是分治的递推了；
    //lsum[l,r] = max(lsum[l,m],isum[l,m] + lsum[m+1,r]);
    //rsum[l,r] = max(rsum[m+1,r],rsum[l,m] + isum[m+1,r]);
    //isum[l,r] = isum[l,m] +isum[m+1,r];
    //ssum[l,r] = max(ssum[l,m],ssum[m+1,r],rsum[l,m]+lsum[m+1,r]);
    struct status{
        int lsum,rsum,isum,ssum;
    };

    status deal(status lpart,status rpart){
        status temp;
        temp.lsum = max(lpart.lsum,lpart.isum + rpart.lsum);
        temp.rsum = max(rpart.rsum,lpart.rsum + rpart.isum);
        temp.isum = lpart.isum + rpart.isum;
        temp.ssum = max(lpart.ssum,rpart.ssum);
        temp.ssum = max(temp.ssum,lpart.rsum + rpart.lsum);
        return temp;
    }

    status get(vector<int>& nums,int l,int r){
        if(l == r){
            return status{nums[l],nums[l],nums[l],nums[l]};
        }
        int m = (l + r) >> 1;
        status lpart,rpart;
        lpart = get(nums,l,m);
        rpart = get(nums,m +1, r);
        return deal(lpart,rpart);
    }

    int XXX(vector<int>& nums) {
        return get(nums, 0, nums.size() - 1).ssum;
    }
};

