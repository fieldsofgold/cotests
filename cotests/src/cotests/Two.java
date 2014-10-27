/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotests;

/**
 *
 * @author Gawronek
 */
public class Two {

    static String reverse(String in, String out) {
        return (in.isEmpty()) ? out :
            (in.charAt(0) == ' ')
            ? out + ' ' + reverse(in.substring(1), "")
            : reverse(in.substring(1), in.charAt(0) + out);
    }
    public static void main(String args[]) {
        String S = "we test coders";
        System.out.println(reverse(S, ""));
    }
}

