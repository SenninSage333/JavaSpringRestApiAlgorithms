package io.github.SenninSage333.SAP.service;

import io.github.SenninSage333.SAP.model.AlgorithmsInterface;
import org.springframework.stereotype.Service;

@Service
public class AlgorithmsService {

    private AlgorithmsInterface algorithmsInterface;

    public AlgorithmsService(AlgorithmsInterface algorithmsInterface) {
        this.algorithmsInterface = algorithmsInterface;
    }

    public String toBinaryFromDecimal(int N) {
        return this.algorithmsInterface.toBinaryFromDecimal(N);
    }

    public String switchDigitsAndReturnOctal(int N){
        return this.algorithmsInterface.switchDigitsAndReturnOctal(N);
    };

    public String reverseDigitsAndReturnHex(int N){
        return this.algorithmsInterface.reverseDigitsAndReturnHex(N);
    };

    public String MoveDigitsAndReturnDecimal(int N){
        return this.algorithmsInterface.MoveDigitsAndReturnDecimal(N);
    };
}
