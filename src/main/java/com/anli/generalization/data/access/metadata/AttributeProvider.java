package com.anli.generalization.data.access.metadata;

import com.anli.generalization.data.entities.metadata.Attribute;
import java.math.BigInteger;

public interface AttributeProvider {

    Attribute create();

    Attribute getById(BigInteger id);

    void remove(Attribute attribute);
}
