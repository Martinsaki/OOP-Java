import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();

        Doctor myDoctor = new Doctor("Martin", "Neurology");
        System.out.println(myDoctor.getName() + "\n" + myDoctor.getSpeciality());

        Patient patient = new Patient("Juan", "juan@gmail.com");
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10pm");
        myDoctor.addAvailableAppointment(new Date(), "5am");

        System.out.println(myDoctor.getAvailableAppointments());
    }
}
