/**
 * @param {string} s
 * @return {string}
 */
var XXX = function(s) {
        //起始位置和长度
        let from = 0, len = -1;
        for (let i = 0; i < s.length; ++i) {
            let l = i, r = i;
            //向左找到和i不同的字符
            while (s[i] == s[--l]);
            //向右找到和i不同的字符
            while (s[i] == s[++r]);
            //while完需要回位
            l += 1, r -= 1;
            //两边同时查找
            while (s[l] != null && s[--l] == s[++r]);
            l += 1, r -= 1;
            //判断长度是否大于已知最大长度
            if (len < r - l + 1) {
                from = l;
                //r是下标, 需要补一位长度
                len = r - l + 1;
            }
        }
        return s.substr(from, len);
};

