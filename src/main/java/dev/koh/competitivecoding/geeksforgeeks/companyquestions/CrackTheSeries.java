package dev.koh.competitivecoding.geeksforgeeks.companyquestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;

public class CrackTheSeries {

    public static void main(String[] args) throws IOException {

        //  Time Stamp : 19th July 2K19, 06:36 PM..!!

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  MathContext is used for Better precision with too big values
//        MathContext mathContext = new MathContext(1000);
//        System.out.println(new BigDecimal(power(2, 243), mathContext));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            //   2  2  4  8  16  512
            //  A0 B0 A1 B1  A2  B2
            //   2  4  16  256  ODD
            //   2  8  512 2^9  EVEN

            BigDecimal x;

            if (n % 2 == 0) {

                int y = n / 2 - 1;

                x = new BigDecimal(Math.pow(2, Math.pow(3, y)), new MathContext(1000));
                System.out.println(x);

            } else {

                double y = n / 2;

                y = Math.pow(2, y);
                x = new BigDecimal(Math.pow(2, y), new MathContext(1000));
                System.out.println(x);

            }

        }

    }

    private static double power(double base, double exp) {

        if (exp == 1)
            return base;

        base *= power(base, --exp);

        return base;

    }

}
