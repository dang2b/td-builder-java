public class ManagerResumeBuilder implements ResumeBuilder {
    private Resume resume;

    public ManagerResumeBuilder() {
        this.resume = new Resume();
        this.resume.addSkill("Agile Management");
        this.resume.addSkill("Leadership");
        this.resume.addInterest("Team Building");
    }

    @Override
    public ResumeBuilder setPersonalInfo(PersonalInfo info) {
        this.resume.setPersonalInfo(info);
        return this;
    }

    @Override
    public ResumeBuilder addEducation(Education education) {
        this.resume.addEducation(education);
        return this;
    }

    @Override
    public ResumeBuilder addExperience(Experience experience) {
        this.resume.addExperience(experience);
        return this;
    }

    @Override
    public ResumeBuilder addSkill(String skill) {
        this.resume.addSkill(skill);
        return this;
    }

    @Override
    public ResumeBuilder addLanguage(String language) {
        this.resume.addLanguage(language);
        return this;
    }

    @Override
    public ResumeBuilder addInterest(String interest) {
        this.resume.addInterest(interest);
        return this;
    }

    @Override
    public Resume build() {
        if (resume.getPersonalInfo() == null) {
            throw new IllegalStateException("Les informations personnelles sont obligatoires.");
        }
        return resume;
    }
}
