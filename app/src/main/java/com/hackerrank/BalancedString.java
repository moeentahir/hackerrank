package com.hackerrank;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalancedString {

    private void someMethod() {
    }
    public static boolean isBalanced(String input) {

        if (input == null || input.equals("")) {
            return true;
        }

        Stack<Character> inputStack = new Stack<>();

        Map<Character, Character> closingBrackets = Stream.of(
                new AbstractMap.SimpleEntry<>(')', '('),
                new AbstractMap.SimpleEntry<>('}', '{'),
                new AbstractMap.SimpleEntry<>(']', '[')
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<Character, Character> openingBrackets = Stream.of(
                new AbstractMap.SimpleEntry<>('(', ')'),
                new AbstractMap.SimpleEntry<>('{', '}'),
                new AbstractMap.SimpleEntry<>('[', ']')
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (Character current : input.toCharArray()) {
            if (openingBrackets.containsKey(current)) {
                inputStack.push(current);
            } else if (closingBrackets.containsKey(current)) {
                if (inputStack.isEmpty() ||  inputStack.peek() != closingBrackets.get(current)) {
                    return false;
                }
                inputStack.pop();
            }
        }

        return inputStack.isEmpty();
    }
}
