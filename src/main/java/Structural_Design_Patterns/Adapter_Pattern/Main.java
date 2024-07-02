package Structural_Design_Patterns.Adapter_Pattern;

import Structural_Design_Patterns.Adapter_Pattern.adaptee.WeightMachineImpl;
import Structural_Design_Patterns.Adapter_Pattern.adaptor.WeightMachineAdaptor;
import Structural_Design_Patterns.Adapter_Pattern.adaptor.WeightMachineAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor = new WeightMachineAdaptorImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdaptor.getWeightInKgs());
    }
}
