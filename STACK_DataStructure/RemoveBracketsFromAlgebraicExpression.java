package STACK_DataStructure;

public class RemoveBracketsFromAlgebraicExpression {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){

            if(sb.charAt(i) == '(' || sb.charAt(i) == ')'){
                sb.delete(i,i+1);
                --i;
            }
        }
        System.out.println(sb.toString());
    }
}
