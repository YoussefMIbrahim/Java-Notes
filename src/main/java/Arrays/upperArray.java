package Arrays;

import java.util.Arrays;

public class upperArray {

    public static void main(String[] args) {

        String sponsors[] = {"Ikea", "at&t", "cvs", "3m"};

        for (int  i = 0; i < sponsors.length; i++){
            /*
            * String company = sponsors[i]
            * String companyInUpper = company.touppercase
            * sponsors[d] = companyInUpper*/
            sponsors[i] = sponsors[i].toUpperCase();
            System.out.println(sponsors[i]);
        }
        System.out.println(Arrays.toString(sponsors));
    }
}
