package Structural_Design_Patterns.Adapter_Pattern.adaptor;

import Structural_Design_Patterns.Adapter_Pattern.adaptee.WeightMachineAdaptee;

public class WeightMachineAdaptorImpl implements WeightMachineAdaptor{

    WeightMachineAdaptee weightMachineAdaptee;

    public WeightMachineAdaptorImpl(WeightMachineAdaptee weightMachineAdaptee) {
        this.weightMachineAdaptee = weightMachineAdaptee;
    }

    @Override
    public int getWeightInKgs() {
        return (int) (this.weightMachineAdaptee.getWeightInPounds() * 0.45);
    }
}
