package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class JobService {

    @Autowired
    private JobRepo professionalRepository;

    public void saveProfessionals(List<Map<String, Object>> professionalsData) {
        List<JobEntity> professionals = new ArrayList<>();

        for (Map<String, Object> data : professionalsData) {
        	JobEntity professional = new JobEntity();
            professional.setId(Long.parseLong(data.get("_id").toString()));
            professional.setDescription(data.get("desc").toString());
            professional.setExperience(Integer.parseInt(data.get("exp").toString()));
            professional.setProfile(data.get("profile").toString());

            // Map techs
            @SuppressWarnings("unchecked")
			List<String> techs = (List<String>) data.get("techs");
            List<Tech> techEntities = new ArrayList<>();
            for (String tech : techs) {
                Tech techEntity = new Tech();
                techEntity.setTechnology(tech);
                techEntity.setJob(professional);
                techEntities.add(techEntity);
            }
            professional.setTechs(techEntities);

            professionals.add(professional);
        }

        professionalRepository.saveAll(professionals);
    }
}
