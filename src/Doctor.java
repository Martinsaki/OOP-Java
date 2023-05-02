import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    // Attributes
    private static int id = 0; // Autoincrement
    private String name;
    private String email;
    private String speciality;


    // Constructor
    Doctor(String name, String speciality) {
        id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("The name is: " + name);
    }


    // Getters and Setters
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Doctor.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    // Functions
    public void showName() {
        System.out.println(name);
    }

    public void showId() {
        System.out.println("ID: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        // Attributes
        private int idAvailableAppointment;
        private Date date;
        private String time;


        // Constructor
        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }


        // Getters and Setters
        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getIdAvailableAppointment() {
            return idAvailableAppointment;
        }

        public void setIdAvailableAppointment(int idAvailableAppointment) {
            this.idAvailableAppointment = idAvailableAppointment;
        }
    }
}
