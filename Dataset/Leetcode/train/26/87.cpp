 int XXX2(vector<int>& nums) 
{
    int count = 0;
    int pre = -10000;
    for(vector<int>::iterator itr = nums.begin(); itr != nums.end(); itr++)
    {
        if(*itr != pre) 
        {
            count++;
            pre = *itr;
        }
        else itr = nums.erase(itr);
    }
    return count;
}

