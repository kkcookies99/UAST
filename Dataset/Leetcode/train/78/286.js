var XXX = function(nums) {
    let combinations = []
    const backtrack = (combination, index) => {
        combinations.push(combination.slice())
        for (let i = index; i < nums.length; i++) {
            combination.push(nums[i])
            backtrack(combination, i + 1)
            combination.pop()
        }
    }
    backtrack([], 0)
    return combinations
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


