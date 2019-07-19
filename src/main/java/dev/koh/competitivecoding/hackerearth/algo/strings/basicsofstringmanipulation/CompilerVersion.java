package dev.koh.competitivecoding.hackerearth.algo.strings.basicsofstringmanipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompilerVersion {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String resultStr = "";
        String str;
        try {
            while (true) {
                str = br.readLine();
                if (!str.contains("->")) {
                    resultStr += str + "\n";
                    continue;
                }

                if (!str.contains("//")) {

                    str = str.replaceAll("->", ".");
                    resultStr += str + "\n";

                    continue;
                }

                Pattern p = Pattern.compile("//");
                Matcher m = p.matcher(str);

                int x = 0;
                if (m.find())
                    x = m.start();

                String s = str.substring(0, x).replaceAll("->", ".");
                resultStr += s + str.substring(x) + "\n";

            }

        } catch (NullPointerException ignored) {
        }

        System.out.println(resultStr);
    }
}
