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
package c1.tip9;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.getClass());

    }

    // try-finally is ugly when used with more than one resource!
    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
    // try-with-resources with a catch clause
    static String firstLineOfFile(String path, String defaultVal) {
        try (
                BufferedReader br = new BufferedReader(new FileReader(path))
        ) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

}