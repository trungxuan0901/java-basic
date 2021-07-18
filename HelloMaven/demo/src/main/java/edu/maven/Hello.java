package edu.maven;

/**
 * Hello
 */
public class Hello {
        public static void main(String[] args) {
            String format = "|%1$-20s|%2$-20s|%3$-20s|\n";
            System.out.format(format, "A", "AA", "AAA");
            System.out.format(format, "B", "", "BBBBB");
            System.out.format(format, "C", "CCCCC", "CCCCCCCC");
         
            String ex[] = { "E", "EEEEEEEEEE", "E" };
         
            System.out.format(String.format(format, (Object[]) ex));
        }
}