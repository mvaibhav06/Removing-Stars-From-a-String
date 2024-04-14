import java.util.Stack;

public class RemovingStars {
    public static String removeStars(String s) {
        Stack<Character> temp = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                temp.pop();
            }else{
                temp.push(ch);
            }
        }

        String out = "";
        for(char ch : temp){
            out += ch + "";
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
