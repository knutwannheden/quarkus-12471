package org.acme.commandmode;

import org.hibernate.envers.DefaultRevisionEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "REV"))
public class RevisionInfo extends DefaultRevisionEntity {
}
