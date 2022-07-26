import javax.swing.tree.TreeNode;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FinalKeyWord {
    public static void main(String[] args) {
        final List<Integer> intList= new ArrayList<>();
        intList.add(2);
        System.out.println(intList.toString());
        List<Integer> intList2= Arrays.asList(1,2,3);
        intList.addAll(intList2);
        System.out.println(intList.toString());
        //not possible
// intList=Arrays.asList(99);
        TreeSet<Integer> treeSet=new TreeSet<>(Collections.reverseOrder());
        treeSet.addAll(Arrays.asList(3,6,9,1));
        System.out.println(treeSet.toString());
        treeSet.add(0);
        treeSet.add(0);
        System.out.println(treeSet.toString());
    }
}
