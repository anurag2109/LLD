package Structural_Design_Patterns.Adapter_Pattern.adaptee;

public class WeightMachineImpl implements WeightMachineAdaptee {
    @Override
    public int getWeightInPounds() {
        return 30;
    }
}
