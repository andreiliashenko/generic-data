package com.anli.generalization.data.access;

import com.anli.generalization.data.entities.DataObject;
import com.anli.generalization.data.entities.metadata.ObjectType;
import java.math.BigInteger;

public interface DataObjectProvider {

    DataObject create(ObjectType type);

    DataObject getById(BigInteger id);

    void remove(DataObject object);
}
