package com.codegym.service;

import com.codegym.model.Note;
import com.codegym.model.NoteType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NoteService extends GeneralService<Note> {
    Page<Note> findAllByTitleContaining(String name, Pageable pageable);
    List<Integer> getNumberPage(Page<Note> notes);
    Iterable<Note> findAllByNoteType(NoteType noteType);
}
