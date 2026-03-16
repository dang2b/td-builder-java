public class SoftwareEngineerResumeBuilder implements ResumeBuilder {
    private Resume resume;

    public SoftwareEngineerResumeBuilder() {
        this.resume = new Resume();
        this.resume.addInterest("Open Source");
        this.resume.addSkill("Git");
        this.resume.addSkill("Clean Code");
    }

    @Override
    public ResumeBuilder setPersonalInfo(PersonalInfo info) {
        // TODO 1: Implémentez la délégation sur l'objet resume et chainez le builder
        return null;
    }

    @Override
    public ResumeBuilder addEducation(Education education) {
        // TODO 1
        return null;
    }

    @Override
    public ResumeBuilder addExperience(Experience experience) {
        // TODO 1
        return null;
    }

    @Override
    public ResumeBuilder addSkill(String skill) {
        // TODO 1
        return null;
    }

    @Override
    public ResumeBuilder addLanguage(String language) {
        // TODO 1
        return null;
    }

    @Override
    public ResumeBuilder addInterest(String interest) {
        // TODO 1
        return null;
    }

    @Override
    public Resume build() {
        // TODO 2: C'est l'étape finale de construction du produit.
        // Si aucune "PersonalInfo" n'est spécifiée, levez une IllegalStateException
        // avec le message d'erreur : "Les informations personnelles sont obligatoires."
        return null;
    }
}
