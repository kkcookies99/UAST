 class Solution:
    def XXX(self, s: str) -> int:
        dict_num={}    #记录索引
        max_length=0
        start=0     #记录起点索引
        for index,num in enumerate(s):   #当这个元素没出现，则长度+1并和原来比较取最大
            if num not in dict_num:
                max_length=max(max_length,index-start+1)
            else:
                if dict_num[num]>=start:   #如果已出现元素在start后面，则start改为该元素索引+1
                    start=dict_num[num]+1
                else:     #已出现元素在start前面，不影响start，更新索引即可
                    max_length=max(max_length,index-start+1)
            dict_num[num]=index   #将索引加入哈希表
        return max_length

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

