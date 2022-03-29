 var XXX = function(nums) {
    let ans=[],temp=[]
    dfs(0)
    return ans
    function dfs(i){
        ans.push([...temp])
        while (i<nums.length){
            temp.push(nums[i])
            dfs(i+1)
            temp.pop()
            i++
        }
    }
};

