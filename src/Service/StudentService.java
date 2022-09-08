package Service;

import Model.Student;

import javax.swing.*;
import java.util.ArrayList;

public class StudentService {
    public ArrayList<Student> listStudent=new ArrayList<>();

    public void generateSample(){
        listStudent.add(new Student("1094887554","Andres","Male",5,5,"Software Engineering"));
        listStudent.add(new Student("1094644845","Valeria","Female",4,4,"Law"));
        listStudent.add(new Student("890046321","Harold","Male",3,3,"Software Engineering"));
        listStudent.add(new Student("1544521133","Valentina","Female",2,0.1,"Software Engineering"));
        listStudent.add(new Student("5131232313","Laura","Female",0,4,"Psychology"));
    }

    public void auxListProm3(){
        ArrayList<Student> listAuxProm3 = new ArrayList<>();
        for (int x=0;x<listStudent.size();x++){
            if (listStudent.get(x).getAverage()>=3){
                listAuxProm3.add(listStudent.get(x));
            }
        }
        printList(listAuxProm3);
    }
    public void printList(ArrayList<Student> arrayList){
        String message="       Name       Id       Gender       Career       Grade 1       Grade 2       Average       \n";
        for (int x=0;x<arrayList.size();x++){
            message+=arrayList.get(x).getName()+"       "+arrayList.get(x).getId()+"       "+arrayList.get(x).getGender()+"       "+arrayList.get(x).getCareer()+"       "+arrayList.get(x).getGrade1()+"       "+arrayList.get(x).getGrade2()+"       "+arrayList.get(x).getAverage()+"\n";
        }
        JOptionPane.showMessageDialog(null,message);
    }

    public void deleteMale(){
        boolean confirm=true;
        do{
            confirm=true;
            int counter=0;
            for (int x=0;x<listStudent.size();x++){
                String[] parts=listStudent.get(x).getName().split("n");
                counter=0;
                if (listStudent.get(x).getGender().equalsIgnoreCase("Male") || parts[0].equalsIgnoreCase("a") ){
                    System.out.println(parts[0].equalsIgnoreCase("A") );
                    System.out.println(listStudent.get(x).getGender().equalsIgnoreCase("Male"));
                    counter=x;
                    confirm=false;
                    break;
                }
            }
            if (confirm==false){ listStudent.remove(counter);}

        }while(confirm==false);
        printList(listStudent);
    }

    public void win3_5(){
       double winPeople1=0;
       double winPeople2=0;
       for (int x=0;x<listStudent.size();x++){
           if (listStudent.get(x).getGrade1()>=3.5){
               winPeople1+=1;
           }
           if (listStudent.get(x).getGrade2()>=3.5){
               winPeople2+=1;
           }
       }
       JOptionPane.showMessageDialog(null,"The percentage of approvement in the first grade is: "+((winPeople1/listStudent.size())*100)+"%\n"+"The percentage of approvement in the second grade is: "+((winPeople2/ listStudent.size())*100)+"%");
    }

    public void comparationA_M(String[] letters){
        boolean confirm=true;
        int finalcounter=0;
        do {
            confirm=true;
            int counter=0;
            end: for (int i=0;i<listStudent.size();i++){
                for (int x=0;x<letters.length;x++){
                    if(listStudent.get(i).getName().charAt(0) == letters[x].charAt(0)){
                        counter=i;
                        confirm=false;
                        break end;
                    }
                }
                finalcounter=i+1;
            }
            if (confirm==false){
                listStudent.remove(counter);
            }
        }while (finalcounter!=listStudent.size());
        printList(listStudent);
    }

    public void rangeApprovement(double range){
        int approve1=0;
        int approve2=0;
        for (int x=0;x< listStudent.size();x++){
            if (listStudent.get(x).getGrade1()>=range){
                approve1+=1;
            }
            if (listStudent.get(x).getGrade2()>=range){
                approve2+=1;
            }
        }
        JOptionPane.showMessageDialog(null,"Total of the people who are up the range in grade 1 are: "+approve1+" Students\nTotal of the people who are up the range in grade 2 are: "+approve2+" Students");
    }

    public void percentageTable(){
        String message="Gender          pc1          pc2   \n";
        double countMalePc1=0;double countMalePc2=0;double countFemalePc1=0;double countFemalePc2=0;double countMale=0;double countFemale=0;
        for (int x=0;x<listStudent.size();x++){
            if (listStudent.get(x).getGender().equalsIgnoreCase("Male")){
                countMale+=1;
                if (listStudent.get(x).getGrade1()>=3.5){
                    countMalePc1+=1;
                }
                if (listStudent.get(x).getGrade2()>=3.5){
                    countMalePc2+=1;
                }
            } else if (listStudent.get(x).getGender().equalsIgnoreCase("Female")){
                countFemale+=1;
                if (listStudent.get(x).getGrade1()>=3.5){
                    countFemalePc1+=1;
                }
                if (listStudent.get(x).getGrade2()>=3.5){
                    countFemalePc2+=1;
                }
            }
        }
        message+="M         "+(countMalePc1/countMale)*100+"%             "+(countMalePc2/countMale)*100+"%\n";
        message+="F         "+(countFemalePc1/countFemale)*100+"%          "+(countFemalePc2/countFemale)*100+"%\n";
        JOptionPane.showMessageDialog(null,message);
    }
}
