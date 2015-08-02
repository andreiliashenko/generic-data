package com.anli.generalization.data.entities.metadata;

import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface ObjectType {

    BigInteger getId();

    ObjectType getParent();

    void setParent(ObjectType parent);

    Collection<ObjectType> getChildren();

    String getName();

    void setName(String name);

    List<Attribute> getAttributes();
}
