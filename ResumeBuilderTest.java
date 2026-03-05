import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResumeBuilderTest {

    @Test
    public void testCreateBasicResume() {
        PersonalInfo info = new PersonalInfo("Alice Dupont", "alice@email.com", "0600000000");

        Resume resume = new Resume.Builder()
                .setPersonalInfo(info)
                .addSkill("Java")
                .addLanguage("Français")
                .build();

        assertEquals("Alice Dupont", resume.getPersonalInfo().getName());
        assertEquals(1, resume.getSkills().size());
        assertEquals("Java", resume.getSkills().get(0));
        assertEquals(1, resume.getLanguages().size());
    }

    @Test
    public void testMissingPersonalInfoRaisesError() {
        assertThrows(IllegalStateException.class, () -> {
            new Resume.Builder()
                    .addSkill("Java")
                    .build();
        });
    }

    @Test
    public void testCompleteResume() {
        PersonalInfo info = new PersonalInfo("Bob Martin", "bob@email.com", "0611111111");
        Experience exp = new Experience("Google", "Développeur", "2020-2023", "Développement backend");
        Education edu = new Education("Université Lyon", "Master Informatique", "2018-2020");

        Resume resume = new Resume.Builder()
                .setPersonalInfo(info)
                .addExperience(exp)
                .addEducation(edu)
                .addSkill("Python")
                .addLanguage("Anglais")
                .addInterest("Open Source")
                .build();

        assertEquals("Bob Martin", resume.getPersonalInfo().getName());
        assertEquals(1, resume.getExperiences().size());
        assertEquals("Google", resume.getExperiences().get(0).getCompany());
        assertEquals(1, resume.getEducation().size());
        assertEquals("Master Informatique", resume.getEducation().get(0).getDegree());
        assertEquals(1, resume.getInterests().size());
    }
}
