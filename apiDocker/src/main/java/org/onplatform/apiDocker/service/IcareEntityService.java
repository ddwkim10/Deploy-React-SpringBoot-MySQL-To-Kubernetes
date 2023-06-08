package org.onplatform.apiDocker.service;

import org.onplatform.apiDocker.model.IcareEntity;
import org.onplatform.apiDocker.repository.IcareDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IcareEntityService implements IcareEntityServiceIF {

        @Autowired
        private IcareDBRepository icaredbRepository;

//        public IcareEntityService(IcareDBRepository icareRepository) {
//            this.icaredbRepository = icareRepository;
//        }

        @Override
        public IcareEntity insertIcareMember(IcareEntity icareEntity) {
            return icaredbRepository.save(icareEntity);
        }

        @Override
        public List<IcareEntity> getAllIcareMembers() {
            List<IcareEntity> all = icaredbRepository.findAll();
            return all;
        }
}
