public interface ResumeBuilder {
    ResumeBuilder setPersonalInfo(PersonalInfo info);
    ResumeBuilder addEducation(Education education);
    ResumeBuilder addExperience(Experience experience);
    ResumeBuilder addSkill(String skill);
    ResumeBuilder addLanguage(String language);
    ResumeBuilder addInterest(String interest);
    Resume build();
}
