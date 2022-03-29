 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        res=[];
        dictionary_1=[];
        for index in range(len(nums)):
            dictionary_1.append(target-nums[index]);
        dic={};
        for index in range(len(nums)):
            dic.setdefault(dictionary_1[index],index);
        for index in range(len(nums)):
            if nums[index] in dic:
                if(index!=dic.get(nums[index])):
                    res.append(index);
                    res.append(dic.get(nums[index]));
                    break;
        return res;

