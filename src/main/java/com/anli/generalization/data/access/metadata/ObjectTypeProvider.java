package com.anli.generalization.data.access.metadata;

import com.anli.generalization.data.entities.metadata.ObjectType;
import java.math.BigInteger;

public interface ObjectTypeProvider {

    ObjectType create(ObjectType parentType);

    ObjectType getById(BigInteger id);

    void remove(ObjectType type);
}
