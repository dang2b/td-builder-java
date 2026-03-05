public class Education {
    private String institution;
    private String degree;
    private String period;

    public Education(String institution, String degree, String period) {
        this.institution = institution;
        this.degree = degree;
        this.period = period;
    }

    public String getInstitution() { return institution; }
    public String getDegree() { return degree; }
    public String getPeriod() { return period; }
}
