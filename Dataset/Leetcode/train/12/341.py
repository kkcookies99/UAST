 class Solution:
    def XXX(self, num: int) -> str:
        s=""
        hashmap={1:"I",5:"V",10:"X",50:"L",100:"C",500:"D",1000:"M",4:"IV",9:"IX",40:"XL",90:"XC",400:"CD",900:"CM"}
        nums=list(hashmap.keys())
        nums.sort(reverse=True)   
        for n in nums:
            if num>=n:
                count=num//n
                s+=hashmap[n]*count
                num-=count*n  
        return s

