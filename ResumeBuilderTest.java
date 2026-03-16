import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ResumeBuilderTest {
    @Test
    public void testSoftwareEngineerResume() {
        PersonalInfo info = new PersonalInfo("Alice Dupont", "alice@email.com", "0600000000");
        ResumeBuilder builder = new SoftwareEngineerResumeBuilder();
        
        builder.setPersonalInfo(info);
        builder.addSkill("Java");
        builder.addLanguage("Français");
        Resume resume = builder.build();

        assertEquals("Alice Dupont", resume.getPersonalInfo().getName());
        assertTrue(resume.getSkills().contains("Git"));
        assertTrue(resume.getSkills().contains("Java"));
        assertTrue(resume.getInterests().contains("Open Source"));
        assertEquals(3, resume.getSkills().size()); // Git, Clean Code, Java
        assertEquals(1, resume.getLanguages().size());
    }

    @Test
    public void testManagerResume() {
        PersonalInfo info = new PersonalInfo("Bob Martin", "bob@email.com", "0611111111");
        ResumeBuilder builder = new ManagerResumeBuilder();
        
        builder.setPersonalInfo(info);
        builder.addSkill("Scrum");
        Resume resume = builder.build();

        assertEquals("Bob Martin", resume.getPersonalInfo().getName());
        assertTrue(resume.getSkills().contains("Leadership"));
        assertTrue(resume.getSkills().contains("Scrum"));
        assertTrue(resume.getInterests().contains("Team Building"));
        assertEquals(3, resume.getSkills().size()); // Agile Management, Leadership, Scrum
    }

    @Test
    public void testMissingPersonalInfoRaisesError() {
        assertThrows(IllegalStateException.class, () -> {
            ResumeBuilder builder = new SoftwareEngineerResumeBuilder();
            builder.addSkill("Java");
            builder.build();
        });
    }

    @Test
    public void testCompleteResume() {
        PersonalInfo info = new PersonalInfo("Charlie", "charlie@email.com", "0622222222");
        Experience exp = new Experience("Google", "Développeur", "2020-2023", "Développement backend");
        Education edu = new Education("Université Lyon", "Master Informatique", "2018-2020");
        
        ResumeBuilder builder = new SoftwareEngineerResumeBuilder();
        builder.setPersonalInfo(info);
        builder.addExperience(exp);
        builder.addEducation(edu);
        builder.addSkill("Python");
        builder.addLanguage("Anglais");
        Resume resume = builder.build();

        assertEquals("Charlie", resume.getPersonalInfo().getName());
        assertEquals(1, resume.getExperiences().size());
        assertEquals("Google", resume.getExperiences().get(0).getCompany());
        assertEquals(1, resume.getEducation().size());
        assertEquals("Master Informatique", resume.getEducation().get(0).getDegree());
    }
}
