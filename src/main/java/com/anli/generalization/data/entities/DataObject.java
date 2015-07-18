package com.anli.generalization.data.entities;

import com.anli.generalization.data.entities.metadata.Attribute;
import com.anli.generalization.data.entities.metadata.ObjectType;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

public interface DataObject {

    BigInteger getId();

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    DataObject getParent();

    Collection<DataObject> getChildren(ObjectType objectType, boolean hierarchically);

    void addChild(DataObject child);

    void removeChild(DataObject child);

    <T> T getValue(Attribute attribute);

    <T> void setSingleValue(Attribute attribute, T value);

    <T> void setMultipleValues(Attribute attribute, List<T> values);

    <T> void addMultipleValue(Attribute attribute, T value);
}
