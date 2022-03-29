 class Solution {
public:
    int XXX(string s) {
        //左右指针指示滑窗，记录索引的数组不好赋值为-1，干脆把索引全部+1
        int i = 1, j = 1;
        int l = s.length();   
        
        //ASIC码值共有256个值，直接用一个数组存储每个字符出现的索引值
        //数组初始化默认全部为0
        int c_list[256] = {0};
        int m = 0;

        while(j<=l){
            int c = (int)s[j-1];
            // 在i-j滑窗内未出现过，即无重复元素
            if(c_list[c]<i){
                c_list[c] = j; 
            }else {
                // 重新数
                m = max(m, j-i);
                //滑窗左指针移动到重复索引下一个位置
                i =  c_list[c] + 1;
                c_list[c] = j;
            }
            j++;
        }

        return max(m, j-i);
    }
};

