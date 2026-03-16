package correction;

import java.util.ArrayList;
import java.util.List;

public class Resume {
    private PersonalInfo personalInfo;
    private List<Experience> experiences;
    private List<Education> education;
    private List<String> skills;
    private List<String> languages;
    private List<String> interests;

    public Resume() {
        this.experiences = new ArrayList<>();
        this.education = new ArrayList<>();
        this.skills = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.interests = new ArrayList<>();
    }

    public PersonalInfo getPersonalInfo() { return personalInfo; }
    public void setPersonalInfo(PersonalInfo personalInfo) { this.personalInfo = personalInfo; }

    public List<Experience> getExperiences() { return experiences; }
    public void addExperience(Experience exp) { this.experiences.add(exp); }

    public List<Education> getEducation() { return education; }
    public void addEducation(Education edu) { this.education.add(edu); }

    public List<String> getSkills() { return skills; }
    public void addSkill(String skill) { this.skills.add(skill); }

    public List<String> getLanguages() { return languages; }
    public void addLanguage(String language) { this.languages.add(language); }

    public List<String> getInterests() { return interests; }
    public void addInterest(String interest) { this.interests.add(interest); }
}
