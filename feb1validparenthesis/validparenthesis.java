class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for(char c: s.toCharArray()){
        if(c == '(')
            stack.push(')');
        else if(c == '{')
            stack.push('}');
        else if(c == '[')
            stack.push(']');
        else if(stack.isEmpty() || stack.pop() != c)
            return false;
    }
    return stack.isEmpty();
        
    }
}

//https://www.youtube.com/watch?v=3gqYc56p9qU&t=375s
