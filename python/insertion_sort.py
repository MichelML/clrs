# Sorting problem:
# 
# Input: A sequence of n numbers {a1, a2, ... , an }
# 
# Output: A permutation (reordering) {a1', a2', ... , an' } 
# 

def insertion_sort(array):
    startIndex = 1
    valueAtStartIndex = 0
    indexOfValueToInsert = 0

    for startIndex in range(1, len(array)):

        valueAtStartIndex = array[startIndex]
        indexOfValueToInsert = startIndex - 1

        while indexOfValueToInsert > -1 and array[indexOfValueToInsert] > valueAtStartIndex:
            array[indexOfValueToInsert + 1] = array[indexOfValueToInsert]
            indexOfValueToInsert = indexOfValueToInsert - 1

        array[indexOfValueToInsert + 1] = valueAtStartIndex

    print(array)


insertion_sort([2, 1, 6, 7, 8, 1, 2, 3, 4, 5])
insertion_sort([203894750923874098, 023452345234, 90809809809808, 6464646466, 999999,234,23,3,-19819891898, -19])
insertion_sort([90,80,70,60,40,20,10])
insertion_sort([1000,900,800,400,600,700,200,100,30,50,60,70,801,10000,1,23452345, -34, -1, -1000, -13456345])
insertion_sort([-10, 0 , 0 , 0 , 0 , 0 ,0 , -20, -20.1, 10.2, 1000.50, 90.112341234123])
