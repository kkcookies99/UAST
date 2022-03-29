 var XXX = function (s) {
    let map = new Map()
    let result = 0, count = 0, i = 0
    while (i < s.length) {
        if (!map.has(s[i])) {
            map.set(s[i], i)
            count++
            i++
        } else {
            if (result < count) result = count
            i = map.get(s[i]) + 1   //从重复字符的索引下一位开始继续循环
            map.clear() //清空哈希表重复利用
            count = 0   //重置count
        }
    }
    return result < count ? count : result  //最后这里再判断一下防止直接在if条件中结束循环 result未被赋新值的情况
}


