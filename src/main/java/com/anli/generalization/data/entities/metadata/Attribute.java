package com.anli.generalization.data.entities.metadata;

import java.math.BigInteger;
import java.util.List;

public interface Attribute {

    BigInteger getId();

    AttributeType getType();

    void setType(AttributeType type);

    String getName();

    void setName(String name);

    boolean isMultiple();

    void setMultiple(boolean multiple);

    List<ListEntry> getListEntries();

    ObjectType getReferenceType();

    void setReferenceType(ObjectType referenceType);
}
