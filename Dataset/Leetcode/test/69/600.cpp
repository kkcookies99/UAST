class Solution {
public:

    int XXX(int x) {
        long long start = 0, end =  x/2 + 1;
        long long m ;
        while(start < end){  // m*m  >= x 的第一个元素，但是和定义不符，定义要求8的时候返回的是2，不是3，所以后面要加个判断
            m = (start+end)/2;
            if(m*m < x) start = m + 1;
            else end  = m;
        } 
        return start*start>x?start-1:start;  //返回较小的值
    }
};

