public class SoftwareEngineerResumeBuilder implements ResumeBuilder {
    private Resume resume;

    public SoftwareEngineerResumeBuilder() {
        this.resume = new Resume();
        this.resume.addInterest("Open Source");
        this.resume.addSkill("Git");
        this.resume.addSkill("Clean Code");
    }

    @Override
    public void setPersonalInfo(PersonalInfo info) {
        // TODO 1: Implémentez la délégation sur l'objet resume
    }

    @Override
    public void addEducation(Education education) {
        // TODO 1
    }

    @Override
    public void addExperience(Experience experience) {
        // TODO 1
    }

    @Override
    public void addSkill(String skill) {
        // TODO 1
    }

    @Override
    public void addLanguage(String language) {
        // TODO 1
    }

    @Override
    public void addInterest(String interest) {
        // TODO 1
    }

    @Override
    public Resume build() {
        // TODO 2: C'est l'étape finale de construction du produit.
        // Si aucune "PersonalInfo" n'est spécifiée, levez une IllegalStateException
        // avec le message d'erreur : "Les informations personnelles sont obligatoires."
        return null;
    }
}
