import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {


        BinaryOperator<String> bin = (a,b) ->{
            if (a.length()>=b.length()){
                return a;
            }else {
                return b;
            }
        };
        System.out.println(bin.apply("adweffeefedqww","svddsa"));
    }
}
