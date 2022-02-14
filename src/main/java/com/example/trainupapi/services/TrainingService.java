package com.example.trainupapi.services;

import com.example.trainupapi.models.Training;
import com.example.trainupapi.repositories.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TrainingService {
    @Autowired
    private TrainingRepository trainingRepository;

    public Training getTrainingByTrainingId(long id) {
        return trainingRepository.getById(id);
    }

    public List<Training> getTrainingsByUserId(long id) {
        return trainingRepository.findAllByUserId(id);
    }

    public void saveTraining(Training training) {
        trainingRepository.save(training);
    }

    public void deleteTrainingByTrainingId(long id) {
        return trainingRepository.deleteAllById(id);
    }
}
