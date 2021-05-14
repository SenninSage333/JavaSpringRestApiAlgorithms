package io.github.SenninSage333.SAP.implementations;

import io.github.SenninSage333.SAP.model.AlgorithmsInterface;
import org.springframework.stereotype.Component;

@Component
public class Algorithms implements AlgorithmsInterface {

    public Algorithms() {
    }

    public String toBinaryFromDecimal(int N) {
        return Integer.toBinaryString(N);
    }

    public String switchDigitsAndReturnOctal(int N) {
        String temp = Integer.toBinaryString(N);
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '0') {
                result += "1";
            } else {
                result += "0";
            }
        }
        return Integer.toOctalString(Integer.parseInt(result, 2));
    }

    public String reverseDigitsAndReturnHex(int N) {
        String result = Integer.toBinaryString(N);
        StringBuilder temp = new StringBuilder();
        result = temp.append(result).reverse().toString();
        return Integer.toHexString(Integer.parseInt(result, 2)).toUpperCase();
    }

    public String MoveDigitsAndReturnDecimal(int N) {
        String temp = Integer.toBinaryString(N);
        StringBuilder strBld = new StringBuilder();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == '0') {
                strBld.append("0");
            } else {
                strBld.insert(0, "1");
            }
        }
        String result = String.valueOf(Integer.parseInt(strBld.toString(), 2));
        return result;
    }
}
