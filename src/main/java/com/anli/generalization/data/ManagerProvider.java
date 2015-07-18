package com.anli.generalization.data;

import com.anli.generalization.data.access.DataObjectManager;
import com.anli.generalization.data.access.metadata.AttributeManager;
import com.anli.generalization.data.access.metadata.ListEntryManager;
import com.anli.generalization.data.access.metadata.ObjectTypeManager;

public interface ManagerProvider {

    DataObjectManager getDataObjectManager();

    AttributeManager getAttributeManager();

    ObjectTypeManager getObjectTypeManager();

    ListEntryManager getListEntryManager();
}
