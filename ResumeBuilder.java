public interface ResumeBuilder {
    void setPersonalInfo(PersonalInfo info);
    void addEducation(Education education);
    void addExperience(Experience experience);
    void addSkill(String skill);
    void addLanguage(String language);
    void addInterest(String interest);
    Resume build();
}
