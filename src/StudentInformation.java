class StudentInformation {
    public int ID;
    public String firstName;
    public double CGPA;

    public StudentInformation(int ID, String firstName, double CGPA) {
        super();
        this.ID = ID;
        this.firstName = firstName;
        this.CGPA = CGPA;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getCGPA() {
        return CGPA;
    }
}