import java.util.ArrayList;
import java.util.List;

public class Resume {
    private PersonalInfo personalInfo;
    private List<Experience> experiences;
    private List<Education> education;
    private List<String> skills;
    private List<String> languages;
    private List<String> interests;

    private Resume() {
        this.experiences = new ArrayList<>();
        this.education = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.interests = new ArrayList<>();
    }

    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public List<Experience> getExperiences() { return experiences; }
    public List<Education> getEducation() { return education; }
    public List<String> getSkills() { return skills; }
    public List<String> getLanguages() { return languages; }
    public List<String> getInterests() { return interests; }

    public static class Builder {
        private PersonalInfo personalInfo;
        private List<Experience> experiences = new ArrayList<>();
        private List<Education> education = new ArrayList<>();
        private List<String> skills = new ArrayList<>();
        private List<String> languages = new ArrayList<>();
        private List<String> interests = new ArrayList<>();

        public Builder setPersonalInfo(PersonalInfo personalInfo) {
            this.personalInfo = personalInfo;
            return this;
        }

        public Builder addExperience(Experience experience) {
            this.experiences.add(experience);
            return this;
        }

        public Builder addEducation(Education education) {
            this.education.add(education);
            return this;
        }

        public Builder addSkill(String skill) {
            this.skills.add(skill);
            return this;
        }

        public Builder addLanguage(String language) {
            this.languages.add(language);
            return this;
        }

        public Builder addInterest(String interest) {
            this.interests.add(interest);
            return this;
        }

        public Resume build() {
            if (personalInfo == null) {
                throw new IllegalStateException("Les informations personnelles sont obligatoires.");
            }
            Resume resume = new Resume();
            resume.personalInfo = this.personalInfo;
            resume.experiences = this.experiences;
            resume.education = this.education;
            resume.skills = this.skills;
            resume.languages = this.languages;
            resume.interests = this.interests;
            return resume;
        }
    }
}
