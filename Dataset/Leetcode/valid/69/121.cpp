class Solution {
public:
    int calculate_sqrt(int start, int end, int num)
    {
        if(start>end)
            return -1;
        int middle = (start + end)/2;
        double middle_num = (double)middle*middle;
        double middle_next = (double)(middle+1)*(middle+1);
        if(middle_num < num && middle_next>num || middle_num==num)
        {
            return middle;
        }
        if(middle_num < num)
        {
            return calculate_sqrt(middle+1, end, num);
        }else 
        {
            return calculate_sqrt(start, middle-1, num);
        }

    }
    int XXX(int x) {
        return calculate_sqrt(0, x, x);
    }
};

