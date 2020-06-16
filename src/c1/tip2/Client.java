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
package c1.tip2;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        Facts cocaCola = new Facts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    }
}