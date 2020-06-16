/**
 * <p>
 * For more information about , welcome to http://www.guchaolong.com
 * <p>
 * project: effective_java
 * <p>
 * Revision History:
 * Date          Version       Name            Description
 * 2019/6/30 1.0          guchaolong          Creation File
 */
package c1.tip1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class T<A> {
    private A a1;
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list.getClass());
    }
}