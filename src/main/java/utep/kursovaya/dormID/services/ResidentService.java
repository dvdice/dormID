package utep.kursovaya.dormID.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import utep.kursovaya.dormID.models.Resident;
import utep.kursovaya.dormID.repositories.ResidentRepository;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
public class ResidentService {
    private final ResidentRepository residentRepository;

    public List<Resident> list() {
        return residentRepository.findAll();
    }

    public void saveResident(Resident resident){
        log.info("Saving new {}", resident);
        residentRepository.save(resident);
    }

    public void deleteResident(Long ID){
        residentRepository.deleteById(ID);
    }

    public Resident getResidentById(Long id) {
        return residentRepository.findById(id).orElse(null);
    }
}
