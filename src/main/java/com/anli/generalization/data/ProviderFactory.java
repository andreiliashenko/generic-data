package com.anli.generalization.data;

import com.anli.generalization.data.access.DataObjectProvider;
import com.anli.generalization.data.access.metadata.AttributeProvider;
import com.anli.generalization.data.access.metadata.ListEntryProvider;
import com.anli.generalization.data.access.metadata.ObjectTypeProvider;

public interface ProviderFactory {

    DataObjectProvider getDataObjectManager();

    AttributeProvider getAttributeManager();

    ObjectTypeProvider getObjectTypeManager();

    ListEntryProvider getListEntryManager();
}
