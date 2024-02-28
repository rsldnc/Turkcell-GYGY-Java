package com.turkcell.kodlama.io.devs.models;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Language> languages;

    public Database() {
        this.languages = new ArrayList<Language>();
        this.languages.add(new Language(1,"Java"));
    }

    public List<Language> getlanguages() {
        return languages;
    }

    public void setLanguages(Language language) {
        this.languages.add(language);
    }
}
