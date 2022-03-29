 class Solution {
public:
    int XXX(string s) {
        //采用map，保存每个元素的键，重新计算时，对应的键归0
        map<char, int> a;
        int res = 0;    //res用来记录新无重复字符字串的起始位置
        int length = 0; //用来记录最长无重复字串长度
        int length_string = s.length();
        
        /*不需要清空a，计算无重复字串时，只计算res之后的（包含res）
        元素。res之前已存在于map中的不需要管，更新对应键值即可。*/
        for (int i=0; i<length_string; i++){
            if (a.count(s[i])>0 && a[s[i]] >= res){  
                /* 说明a计算序列中有元素e，字串已然重复了
                前者成立说明当前位置元素在map中拥有一个
                后者则是当相同元素在res之后才进行修改，否则忽略*/

                //先判断字串长度
                if (i-res > length) length = i-res;

                res = a[s[i]] + 1;//a[s[i]]是对应的索引
                //下面这句与if外面的那句作用相同
                // a[s[i]] = i;    //更新重复元素的位置
            }
            a[s[i]] = i;//即使在res之前出现了该元素，也会更新其索引
        }

        //最后遍历完，还要判断一次
        if (length_string-res > length) length = length_string-res;
        return length;

    }
};```


