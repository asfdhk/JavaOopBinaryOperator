import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(1,2,3,4,5);
        List<Integer> second = Arrays.asList(1,2,56,46,5);

        BinaryOperator<List<Integer>> bin = (a, b) ->{
            List<Integer> list = new ArrayList<>();
            for (int i:a){
                for (int n:b){
                    if (i == n){
                        list.add(i);
                    }
                }
            }
            return list;
        };
        System.out.println(bin.apply(first,second));
    }
}
