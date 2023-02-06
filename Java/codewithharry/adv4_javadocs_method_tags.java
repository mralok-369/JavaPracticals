package com.company.codewithharry;

/**
 * This is a good class
 */
public class adv4_javadocs_method_tags {
    /**
     *
     * @param args These are arguments supplied to command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is a method and this is the most beautiful method of this class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return return the sum of i and j as integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j) throws Exception{
        if (i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return  c;
    }
}
