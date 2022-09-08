package Application;

import Controller.FuntionStudent;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FuntionStudent funtionStudent=new FuntionStudent();
        funtionStudent.prepareSample();

        int option= JOptionPane.showOptionDialog(
                null,"Seleccione opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,    // null para icono por defecto.
                new Object[] { "List of average 3", "Delete Male and name with first An", "Comparation A....M","Approvement in grades","Approvement with range","Table approvement","Quit" },null);

        switch (option){
            case 0:
                funtionStudent.prepareAuxListProm3();
                break;
            case 1:
                funtionStudent.prepareDeleteMale();
                break;
            case 2:
                funtionStudent.prepareComparationA_M();
                break;
            case 3:
                funtionStudent.preparewin3_5();
                break;
            case 4:
                funtionStudent.prepareRangeApprovement();
                break;
            case 5:
                funtionStudent.preparePercentageTable();
                break;
        }
    }
}