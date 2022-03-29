 class Solution {
public:
    /*!
     *  @brief 字符串转数组.
     *  @details 转换规则如下
     *      - 丢弃前导空格
     *      - 第一个有效位位可有正负号
     *      - 截取有效数字至字符串末或首个非数字字符止
     *      - 未读入数字则返回0
     *      - 转换结果小于INT_MIN返回INT_MIN，大于INT_MAX返回INT_MAX，其余返回原值
     * 
     *      @param [in] s 待转换的字符串
     *      @return 转换结果
     *      @note 空白字符仅限' '
     */
    int XXX(string s) {
        auto it = s.cbegin(),  //创建扫描迭代器
             end = s.cend(); 


        while (it != end && *it == ' ')      //忽略前导空格
            ++it;
        if (it == end)
            return 0;

        int sign{ 1 };          //符号位
        if (*it == '+')         //检测第一位
            ++it;
        else if (*it == '-') {
            sign = -1;
            ++it;
        }

        double l{};
        while (it != end && isdigit(*it))
        {
            l = l * 10 + *it++ - '0';
        }

        l *= sign;
        if (l > INT_MAX)
            return INT_MAX;
        else if (l < INT_MIN)
            return INT_MIN;
        else return l;
    }
};


