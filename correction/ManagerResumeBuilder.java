package correction;

public class ManagerResumeBuilder implements ResumeBuilder {
    private Resume resume;

    public ManagerResumeBuilder() {
        this.resume = new Resume();
        this.resume.addSkill("Agile Management");
        this.resume.addSkill("Leadership");
        this.resume.addInterest("Team Building");
    }

    @Override
    public void setPersonalInfo(PersonalInfo info) {
        this.resume.setPersonalInfo(info);
    }

    @Override
    public void addEducation(Education education) {
        this.resume.addEducation(education);
    }

    @Override
    public void addExperience(Experience experience) {
        this.resume.addExperience(experience);
    }

    @Override
    public void addSkill(String skill) {
        this.resume.addSkill(skill);
    }

    @Override
    public void addLanguage(String language) {
        this.resume.addLanguage(language);
    }

    @Override
    public void addInterest(String interest) {
        this.resume.addInterest(interest);
    }

    @Override
    public Resume build() {
        if (resume.getPersonalInfo() == null) {
            throw new IllegalStateException("Les informations personnelles sont obligatoires.");
        }
        return resume;
    }
}
