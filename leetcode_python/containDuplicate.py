from typing import List

def contains_duplicate(nums: List[int]) -> bool:
    """
    Given an interger array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    """
    numSet = set()
    for num in nums:
        if num in numSet:
            return True
        numSet.add(num)
    return False

if __name__ == "__main__":
    sample = [1, 2, 3, 1]
    print(contains_duplicate(sample))
    sample1 = [1, 2, 3]
    print(contains_duplicate(sample1))

