class Solution {
public:
    int XXX(int x) {
        long _begin = 1, _end = x;
        long mid;
        if (x==0)
        {
            return 0;
        }
            while (_begin <= _end)
            {
                mid = (_begin + _end) / 2;
                if ((mid)*(mid ) > x)
                {
                    _end = mid - 1;
                }
                if ((mid)*(mid)<x)
                {
                    _begin = mid + 1;
                }
                if (mid*mid==x||(mid*mid<x&&(mid+1)*(mid+1)>x))
                {
                    return mid;
                }
                if (mid*mid>x&&(mid-1)*(mid-1)<x)
                {
                    return --mid;
                }
            }
            return mid;
        }
    };

