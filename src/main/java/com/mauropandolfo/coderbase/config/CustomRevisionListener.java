package com.mauropandolfo.coderbase.config;

import com.mauropandolfo.coderbase.entites.audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity){
        final Revision revision = (Revision) revisionEntity;
    }
}
