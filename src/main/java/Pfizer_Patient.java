import java.time.LocalDate;

public class Pfizer_Patient extends Patient{
    public Pfizer_Patient (String name){
        super(name);
    }
    public void Display(){
        System.out.println(name+' '+"Pfizer Vaccination;");
        System.out.println("Location: Southall;");
        LocalDate currentDate=LocalDate.now();
        LocalDate laterDate=currentDate.plusDays(5);
        System.out.println("The 1st Vaccine with doctor, date:"+currentDate);
        System.out.println("The 2nd Vaccine with nurse, date:"+laterDate);

    }
}
