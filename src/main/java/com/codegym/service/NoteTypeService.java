package com.codegym.service;

import com.codegym.model.NoteType;

public interface NoteTypeService extends GeneralService<NoteType> {
    Iterable<NoteType> findAll();
}