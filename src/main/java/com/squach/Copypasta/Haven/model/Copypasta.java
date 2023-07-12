package com.squach.Copypasta.Haven.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Copypasta {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String title;
    private String content;

    public Copypasta(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
