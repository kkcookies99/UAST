 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        len_inte = len(intervals)
        intervals.sort(key=lambda x: x[0])      # 将二维列表中的每一个一维列表按照第一个元素值的大小排序,一定要先排序后存值（存入mergr_list）
        XXX_list = [intervals[0]]     # 将intervals的第一个列表加入最终的答案列表中
        for i in range(1, len_inte):
            if XXX_list[-1][1] >= intervals[i][0]:    # 如果第一个列表和第二个列表有交叉（1列表的右端点大于等于2列表的左端点），-1表明始终取XXX_list中的最后一个列表
                XXX_list[-1][1] = max(intervals[i][1], XXX_list[-1][1]) # 合并两个列表，合并后的列表的右端点为要合并两列表右端点的最大值，存入XXX_list
            else:
                XXX_list.append(intervals[i]) # 若没有交叉，则将第2个列表存入XXX_list中
        return XXX_list

