package ch.zhaw.iwi.devops.fizzbuzz;

public class PersonCheck {

    //Check who of our family your are looking for, depending on the range of the age, the fitting person will be choosen

    public String personCheck(int zahl){
        if (zahl <= 10){
            return "Jonas";
        }else if (zahl >10 && zahl <= 20){
            return "Paul";
        }else if (zahl >20 && zahl <=40){
            return "Sascha";
        }else if (zahl >40 && zahl <=60){
            return "Uncle Peter";
            
        }
        return "not specified";
    }
    
}
