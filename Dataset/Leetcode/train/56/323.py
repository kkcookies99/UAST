 class Solution(object):
    def XXX(self, intervals):
        tag_list = [0] * max([max(item) for item in intervals])
        same_tag,remove_list = [], []
        for item in intervals:
            for i in range(item[0], item[1]):
                tag_list[i] = 1
            if item[0] == item[1]:
                same_tag.append(item[0])
        result = []
        tmp = 0 if tag_list and tag_list[0] == 1 else -1
        for index, item in enumerate(tag_list):
            if index == 0:
                continue
            if item == 0:
                if tag_list[index-1] == 1:
                    if tmp < 0:
                        tmp = index
                    else:
                        result.append([tmp, index])
                        for i in same_tag:
                            if tmp <= i <= index:
                                remove_list.append(i)
                        tmp = -1
            else:
                if tag_list[index-1] == 0:
                    if tmp < 0:
                        tmp = index
                    else:
                        result.append([tmp, index])
                        for i in same_tag:
                            if tmp <= i <= index:
                                remove_list.append(i)
                        tmp = -1
                else:
                    if tmp < 0:
                        tmp = index - 1
        if tmp >= 0:
            result.append([tmp, len(tag_list)])
            for i in same_tag:
                if tmp <= i <= len(tag_list):
                    remove_list.append(i)

        for item in set(same_tag):
            if item not in remove_list:
                result.append([item, item])
        return sorted(result)

