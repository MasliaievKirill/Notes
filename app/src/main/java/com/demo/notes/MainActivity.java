package com.demo.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    private ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        notes.add(new Note("Заголовок", "Описание", "Day", 2));
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);
    }
}