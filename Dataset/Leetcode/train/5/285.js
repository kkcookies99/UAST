 /**
 * @param {string} s
 * @return {string}
 */
var XXX = function(s) {
    let maxStr = s[0] || '';
    for (let i = 0.5; i < s.length; i += 0.5) {
        let left = Math.floor(i - 0.75);
        let right= Math.floor(i + 0.75);
        let init = s[(left + right) / 2] || ''
        while (left >= 0 && right < s.length) {
            if (s[left] !== s[right]) {
                break
            }
            init = s[left--] + init + s[right++]
            maxStr = init.length > maxStr.length ? init : maxStr
        }
    }
    return maxStr    
};

