class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            /*
            Make sure to use single quotes (e.g., ch == '(') when comparing char values.
            Otherwise, get a compile-time error because comparing a char to a String. 
            Incompatible operand types char and String
            */
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                
                if (ch == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}