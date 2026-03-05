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
        // À compléter
    }
}
