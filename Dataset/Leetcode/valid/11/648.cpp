 class Solution {
public:
    inline int XXX(const vector<int>& height) {
        int area = 0;
        auto start_iterator = height.begin();
        auto end_iterator = height.end()-1;
        while(start_iterator < end_iterator)
        {
            int tmp_area = min(*start_iterator, *end_iterator) * (end_iterator-start_iterator);
            if(tmp_area > area)
                area = tmp_area;
            if(*start_iterator > *end_iterator)
                --end_iterator;
            else
                ++start_iterator;
        }
        return area;
    }
};

