package org.onplatform.apiDocker.repository;

import org.onplatform.apiDocker.model.IcareEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IcareDBRepository extends JpaRepository<IcareEntity,Integer> {
}
