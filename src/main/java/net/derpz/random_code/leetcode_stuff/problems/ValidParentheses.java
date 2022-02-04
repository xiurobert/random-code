package net.derpz.random_code.leetcode_stuff.problems;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            String daChar = Character.toString(s.charAt(i));
            if (daChar.equals("(") ||daChar.equals("[") || daChar.equals("{")) {
                stack.push(daChar);
            } else {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals(getReverseBracket(daChar))) {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public String getReverseBracket(String bracket) {
        return switch (bracket) {
            case "(" -> ")";
            case "[" -> "]";
            case "{" -> "}";
            case ")" -> "(";
            case "]" -> "[";
            case "}" -> "{";
            default -> "";
        };
    }

}
