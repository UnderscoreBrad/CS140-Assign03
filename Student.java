package assignment03;

/*
    Bradley Estus
    B00780491
 */
public class Student {

    private Person person;
    private String major;
    private double gpa;
    private String bNumber;

    /**
     * Student Constructor, 3 args
     * @param person Person, including all fields
     * @param major Major of the Student
     * @param gpa GPA of the Student
     */
    public Student(Person person, String major, double gpa)
    {
        this.person = person;
        this.major = major;
        this.gpa = gpa;

    }

    /**
     * Student Constructor, 3 args
     * @param person Person, including all fields
     * @param major Major of the Student
     * @param gpa GPA of the Student
     * @param bNumber Student ID Number
     */
    public Student(Person person, String major, double gpa, String bNumber)
    {
        this.person = person;
        this.major = major;
        this.gpa = gpa;
        this.bNumber = bNumber.toUpperCase();

    }
    /**
     * Sets the Student GPA
     * @param gpa GPA, 0.0 to 4.0
     */
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }
    /**
     * Fetches the Person data for the Student
     * @return Person object
     */
    public Person getAsPerson()
    {
        return person;
    }

    /**
     * Fetches the major for the Student
     * @return major
     */
    public String getMajor()
    {
        return major;
    }

    /**
     * Fetches the BNumber of the student
     * @return BNumber
     */
    public String getBNumber(){
        return bNumber;
    }

    /**
     * Fetches the Student GPA
     * @return GPA
     */
    public double getGpa()
    {
        return gpa;
    }

    /**
     * Compares the GPAs of two students
     * @param other other Student
     * @return negative if other.gpa is higher, positive if gpa is higher
     */
    public int compareByGpaTo(Student other)
    {
        return Double.compare(gpa,other.getGpa());
    }

}