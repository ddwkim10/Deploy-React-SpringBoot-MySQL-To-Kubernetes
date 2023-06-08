package org.onplatform.apiDocker.service;

import org.onplatform.apiDocker.model.IcareEntity;

import java.util.List;

public interface IcareEntityServiceIF {
    @SuppressWarnings("SpellCheckingInspection")
    public IcareEntity insertIcareMember(IcareEntity icareEntity);
    public List<IcareEntity> getAllIcareMembers();
}
