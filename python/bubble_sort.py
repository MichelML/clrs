import random as random
#Sorting problem:
#Input: A sequence of n numbers {a1, a2, ... , an }
#Output: A permutation (reordering) {a1', a2', ... , an' } 

def bubbleSort(arr):
    temp = None
    for i in xrange(0,len(arr)):
        for j in xrange(len(arr)-1,0,-1):
            if arr[j] < arr[j-1]:
                temp = arr[j]
                arr[j] = arr[j-1]
                arr[j-1] = temp
    return arr

def generateArr(length, rg, withdecimals):

    arr = []
    randomNumber = None

    while len(arr) < length:
        if withdecimals:
            randomNumber = random.randrange(rg)
        elif rg > 0:
           randomNumber = random.randint(0,rg)
        else:
           randomNumber = random.randint(rg,0)
        arr.append(randomNumber)
    return arr

print(bubbleSort(generateArr(1, 100, False)));
print(bubbleSort(generateArr(5, 100, False)));
print(bubbleSort(generateArr(5, 100, False)));
print(bubbleSort(generateArr(100, -1000, False)));
print(bubbleSort(generateArr(1001, 100, False)));
print(bubbleSort(generateArr(105, 100000, False)));
