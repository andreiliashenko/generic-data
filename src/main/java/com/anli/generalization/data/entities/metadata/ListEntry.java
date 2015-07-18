package com.anli.generalization.data.entities.metadata;

import java.math.BigInteger;

public interface ListEntry {

    BigInteger getId();

    String getEntryValue();

    void setEntryValue(String entryValue);
}
