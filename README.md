# ExercisesCodibly


    1. Create a Java project in your IDE 
    2. Exercise 1: Bubble sort
        1. Create a “BubbleSort” class with one public method called “sort” (You can create other private methods) which has to sort numbers in accordance with the “Bubble sort” algorithm.
            1. method should receive List of Comparable (parameter name = “input”)
            2. method should return List of Comparable, but the numbers should be sorted ascending
            3. if the input is null then method should throw an exception
            4. if the input contains null value in list then method should omit this element
        2. Create a “BubbleSortTest” class and create test methods for below cases:
            1. input = [1,4,5,6,8,3,8] result = [1,3,4,5,6,8,8]
            2. input = [-9.3,0.2,4,0.1,5,9] result = [-9.3,0.1,0.2,4,5,9]
            3. input = [] result = []
            4. input = [null,5.0001] result = [5.0001]
            5. input = null result = RuntimeException 
    3. Exercise 2: Balanced words counter
        1. Balanced words definition: The word is balanced if every letter that occurs in it occurs in the same number of time. E.g. the words: “mama”, “ear”, “aabbcbcccbaa” are balanced but the words “dad”, “elephant”, “abcba” are not. Additionally, the balanced word is not empty.
        2. Create a “BalancedWordsCounter” class with one public method called “count” (you can create other private methods) which has to count how many balanced subwords exist in the input word.
            1. method should receive String (parameter name = “input”)
            2. method should return Integer
            3. the input should contain the letters only, throw an exception if the text contains other characters.
            4. if the input is null then method should throw an exception
        3. Create a “BalancedWordsCounterTest” and create a test methods for below cases:
            1. input = “aabbabcccba” result = 28
            2. input = “” result = 0
            3. input = “abababa1” result = RuntimeException 
            4. input = null result = RuntimeException
