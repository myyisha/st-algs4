package st.algs;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;

/**
 *  第3章：查找
 *  3.1 符号表
 */
public class StTest {
    public static void main(String[] args){
        ST<String, Integer> st;
        st = new ST<String, Integer>();

        for (int i = 0; !StdIn.isEmpty(); i++){
            String key = StdIn.readString();
            st.put(key, i);
        }

        for (String s : st.keys())
            System.out.print(s + " " + st.get(s));
    }
}
