 var XXX = function(s) {
    let result = [];
    let current = [];

    const length = s.length;

    for (let i = 0; i < length; i++) {
        const index = current.indexOf(s[i]);
        if (index === -1) {
            current.push(s[i]);
            if (result.length < current.length) {
                result = current.slice();
            }
        } else {
            current = current.slice(index + 1);
            current.push(s[i]);
        }
    }
    return result.length;
};

