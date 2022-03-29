 var XXX = function(haystack, needle) {
    if (needle === '') {
        return 0;
    }

    if (haystack.length < needle.length) {
        return -1;
    }

    for (let i = 0; i < haystack.length; i++) {
        if (haystack.slice(i, i + needle.length) === needle) {
            return i;
        }
    }

    return -1;
};

