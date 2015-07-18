package com.anli.generalization.data.access.metadata;

import com.anli.generalization.data.entities.metadata.ListEntry;
import java.math.BigInteger;

public interface ListEntryManager {

    ListEntry create();

    ListEntry getById(BigInteger id);

    void remove(ListEntry entry);
}
