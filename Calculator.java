import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        int numSubjects = Integer.parseInt(JOptionPane.showInputDialog("Entrez le nombre de matières"));
        int totalMarks = 0;
        for(int i = 1; i <= numSubjects; i++){
            int marks = Integer.parseInt(JOptionPane.showInputDialog("Entrez les notes obtenues dans la matière " + i));
            totalMarks += marks;
        }
        double averagePercentage = (double)totalMarks / numSubjects;
        String grade;
        if(averagePercentage >= 90){
            grade = "A";
            
        } else if(averagePercentage >= 80){
            grade = "B";
        } else if(averagePercentage >= 70){
            grade = "C";
        } else if(averagePercentage >= 60){
            grade = "D";
        } else {
            grade = "F";
        }
        if(grade=="F"){
                   JOptionPane.showMessageDialog(null, "Total des notes: " + totalMarks + "\nPourcentage moyen: " + averagePercentage + "%\nGrade: " + grade + "\n\nSorry,you're failed");
 
        }else{
                 JOptionPane.showMessageDialog(null, "Total des notes: " + totalMarks + "\nPourcentage moyen: " + averagePercentage + "%\nGrade: " + grade + "\n\nCongrats!");
   
        }
    }
}
