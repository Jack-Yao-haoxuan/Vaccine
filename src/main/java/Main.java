import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            ArrayList<Patient> pats=new ArrayList<Patient>();
            pats.add(new Moderna_Patient("John Molecules"));
            pats.add(new Pfizer_Patient("John Molecules"));
            pats.add(new Pfizer_Patient("Jill Biomedenhall"));
            for(Patient pat:pats){
                pat.Display();
            }

}}
