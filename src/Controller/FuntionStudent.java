package Controller;

import Service.StudentService;

import javax.swing.*;

public class FuntionStudent extends StudentService {
    public void prepareSample(){
        generateSample();
    }

    public void prepareComparationA_M(){
        final String[] letters={"A","B","C","D","E","F","G","H","I","J","K","L","M"};
        comparationA_M(letters);
    }

    public void prepareAuxListProm3(){
        auxListProm3();
    }

    public void prepareDeleteMale(){
        deleteMale();
    }

    public void preparewin3_5(){
        win3_5();
    }

    public void preparePercentageTable(){
        percentageTable();
    }

    public void prepareRangeApprovement(){
        double range=Double.parseDouble(JOptionPane.showInputDialog("Input the range of grades"));
        rangeApprovement(range);
    }


}
