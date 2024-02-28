package com.turkcell.kodlama.io.devs.controllers;

import com.turkcell.kodlama.io.devs.models.Database;
import com.turkcell.kodlama.io.devs.models.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/language")
public class LanguageController {
    private Database database = new Database();

    @PostMapping
    public String create(@RequestBody Language language)
    {
        if(language.getName().isEmpty())
            return "The name of the programming language cannot be left blank";
        for (Language lang: database.getlanguages())
        {
            if (lang.getName().equals(language.getName()))
                return "The name of the programming language cannot be repeated";
            else if (lang.getId() == language.getId())
                return "The id of the programming language cannot be repeated";
        }

        database.setLanguages(language);

        return language.getName() + " added to Db";
    }

    @GetMapping
    public List<Language> read()
    {
        if (database.getlanguages().isEmpty())
            return null;
        else
            return database.getlanguages();
    }

    @PutMapping
    public String update(@RequestBody Language language)
    {
        for (Language lang: database.getlanguages())
        {
            if (lang.getId() == language.getId()){
                lang.setName(language.getName());
                return language.getId() + " updated";
            }
        }
        return language.getId() + " not found";
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id)
    {
        for (Language lang: database.getlanguages())
        {
            if (lang.getId() == id){
                database.getlanguages().remove(lang);
                return id + " deleted";
            }
        }
        return id + " not found";
    }

    @GetMapping("{id}")
    public Language getById(@PathVariable int id)
    {
        for (Language lang: database.getlanguages())
        {
            if (lang.getId() == id)
                return lang;
        }
        return null;
    }
}
