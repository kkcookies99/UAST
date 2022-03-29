 var XXX = function(s) {
    let right = 0, arr = s.split(''), len = arr.length;
    let substringLenList = [], subStr = [];

    if (len === 1 || len === 0) return len;

    while (right <= len - 1) {
        let letter = arr[right];

        if (!subStr.includes(letter)) {
            subStr.push(letter)
            if (right + 1 === len) {
                substringLenList.push(subStr.length);
            }
        } else {
            substringLenList.push(subStr.length);
            subStr.push(letter)

            while (whetherToRepeat(subStr, letter)) {
                subStr.shift();
            }

        }

        right++;
    }

    return Math.max(...substringLenList)
};

function whetherToRepeat (arr, character) {
    let index = arr.indexOf(character), n = 0;

    while (index > -1) {
        n++;
        index = arr.indexOf(character, ++index);
        if (n >= 2) return true;
    }

    if (n === 0 || n === 1) return false;
}

