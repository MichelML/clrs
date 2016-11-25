"use strict";
/**
 * Merge Sort
 * If the list is of length 0 or 1, then it is already sorted. Otherwise:
 * Divide the unsorted list into two sublists of about half the size.
 * Sort each sublist recursively by re-applying merge sort.
 * Merge the two sublists back into one sorted list.
 *
 * inspired from: http://www.stoimen.com/blog/2010/07/02/friday-algorithms-javascript-merge-sort/
 **/

function mergeSort(arr) {
    if (arr.length < 2) {
    
        return arr;
    
    }

    let middle = parseInt(arr.length / 2);
    let left = arr.slice(0, middle);
    let right = arr.slice(middle, arr.length);

    return merge(mergeSort(left), mergeSort(right));

}

function merge(left, right) {
    let result = [];

    while (left.length && right.length) {

        if (left[0] <= right[0]) {

            result.push(left.shift());

        } 
        else {

            result.push(right.shift());

        }

    }

    while (left.length) {

        result.push(left.shift());

    }

    while (right.length) {
    
        result.push(right.shift());

    }

    return result;
}

console.log(mergeSort(generateArr(1, 100)));
console.log(mergeSort(generateArr(100, -1000)));
console.log(mergeSort(generateArr(1001, 100)));
console.log(mergeSort(generateArr(105, 100000)));
console.log(mergeSort(generateArr(10000, 100000000)));
console.log(mergeSort(generateArr(10000, 100000000, true)));


function generateArr(length, range, withdecimals) {
    let arr = [];

    while (arr.length < length) {

        let randomnumber = Math.ceil(Math.random() * range) + ((withdecimals) ? Math.random() : 0);
        arr[arr.length] = randomnumber;

    }

    return arr;

}
