 var XXX = function(n) {
    const backtrack = function(combinations, combination, open, close, n) {
        if (combination.length === n * 2) {
            combinations.push(combination.join(''))
        }
        if (open < n) {
            combination.push('(')
            backtrack(combinations, combination, open + 1, close, n)
            combination.pop()
        }
        if (close < open) {
            combination.push(')')
            backtrack(combinations, combination, open, close + 1, n)
            combination.pop()
        }
    }
    let combination = []
    let combinations = []
    backtrack(combinations, combination, 0, 0, n)
    return combinations
};

