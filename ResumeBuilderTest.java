import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResumeBuilderTest {

    @Test
    public void testSoftwareEngineerResume() {
        PersonalInfo info = new PersonalInfo("Alice Dupont", "alice@email.com", "0600000000");
        ResumeBuilder builder = new SoftwareEngineerResumeBuilder();
        
        Resume resume = builder
                .setPersonalInfo(info)
                .addSkill("Java")
                .addLanguage("Français")
                .build();

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
        
        Resume resume = builder
                .setPersonalInfo(info)
                .addSkill("Scrum")
                .build();

        assertEquals("Bob Martin", resume.getPersonalInfo().getName());
        assertTrue(resume.getSkills().contains("Leadership"));
        assertTrue(resume.getSkills().contains("Scrum"));
        assertTrue(resume.getInterests().contains("Team Building"));
        assertEquals(3, resume.getSkills().size()); // Agile Management, Leadership, Scrum
    }

    @Test
    public void testMissingPersonalInfoRaisesError() {
        assertThrows(IllegalStateException.class, () -> {
            new SoftwareEngineerResumeBuilder()
                    .addSkill("Java")
                    .build();
        });
    }

    @Test
    public void testCompleteResume() {
        PersonalInfo info = new PersonalInfo("Charlie", "charlie@email.com", "0622222222");
        Experience exp = new Experience("Google", "Développeur", "2020-2023", "Développement backend");
        Education edu = new Education("Université Lyon", "Master Informatique", "2018-2020");
        
        Resume resume = new SoftwareEngineerResumeBuilder()
                .setPersonalInfo(info)
                .addExperience(exp)
                .addEducation(edu)
                .addSkill("Python")
                .addLanguage("Anglais")
                .build();

        assertEquals("Charlie", resume.getPersonalInfo().getName());
        assertEquals(1, resume.getExperiences().size());
        assertEquals("Google", resume.getExperiences().get(0).getCompany());
        assertEquals(1, resume.getEducation().size());
        assertEquals("Master Informatique", resume.getEducation().get(0).getDegree());
    }
}
