package BalancedWordsCounter;

import java.util.*;

public class BalancedWordsCounter {

    public int count(String input){

        ifStringContainsOnlyAlphabets(input);

        List<Character> charsBalancedWords = stringToArrayCharConvert(input);

        int balancedWordsCounter = 0;

        while(charsBalancedWords.size() > 0){

            Map<Character, Integer> charsWordsCounter = new LinkedHashMap<Character, Integer>();

            for(int i=0; i<charsBalancedWords.size(); i++){
                for(int j=0; j<=i; j++){
                    charsWordsCounter.merge(charsBalancedWords.get(j), 1, Integer::sum);
                }
                if(isMapValuesIsTheSame(charsWordsCounter)){
                    balancedWordsCounter++;
                }
                charsWordsCounter.clear();
            }
            charsBalancedWords.remove(0);
        }
        //System.out.println("balancedWordsCounter " + balancedWordsCounter);
        return balancedWordsCounter;
    }

    private List<Character> stringToArrayCharConvert(String input){
        List<Character> charBalancedWords = new ArrayList<>();

        for (char ch : input.toCharArray()) {
            charBalancedWords.add(ch);
        }
        return charBalancedWords;
    }

    private boolean isMapValuesIsTheSame(Map<Character, Integer> wordsMap){
        Set<Integer> values = new HashSet<>(wordsMap.values());

        boolean isUnique = values.size() == 1;

        return isUnique;
    }

    private static void ifStringContainsOnlyAlphabets(String input) throws RuntimeException{
        boolean result = input.matches("^(?:[a-zA-Z]|)$");

        if(!result) {
            throw new RuntimeException();
        }
    }
}
