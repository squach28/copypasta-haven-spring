package com.squach.Copypasta.Haven.config;

import com.squach.Copypasta.Haven.model.Copypasta;
import com.squach.Copypasta.Haven.repository.CopypastaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(CopypastaRepository copypastaRepository) {
        return args -> {
          copypastaRepository.save(new Copypasta("Copypasta #1", "blah blah blah blah"));
          copypastaRepository.save(new Copypasta("Copypasta #2", "yeah yeah yeah yeah"));
          copypastaRepository.save(new Copypasta("Copypasta #3", "ye ye ye ye ye ye ye"));
        };
    }
}
