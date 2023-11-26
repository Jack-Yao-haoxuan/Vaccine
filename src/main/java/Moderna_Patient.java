import java.time.LocalDate;
public class Moderna_Patient extends Patient{

    public Moderna_Patient(String name){
        super(name);
    }
    public void Display(){
        System.out.println(name+' '+"Moderna Vaccination;");
        System.out.println("Location: Epping;");
        LocalDate currentDate=LocalDate.now();
        LocalDate laterDate=currentDate.plusDays(4);
        LocalDate FinDate=laterDate.plusDays(4);
        System.out.println("The 1st Vaccine with nurse, date:"+currentDate);
        System.out.println("The 2nd Vaccine with doctor, date:"+laterDate);
        System.out.println("The 3rd Vaccine with doctor, date:"+FinDate);

    }

}
