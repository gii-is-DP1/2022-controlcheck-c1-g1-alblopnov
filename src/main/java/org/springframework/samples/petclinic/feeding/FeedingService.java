package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class FeedingService {
    private FeedingRepository feedingRepository;

    @Transactional(readOnly = true)
    public List<Feeding> getAll(){
        return this.feedingRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<FeedingType> getAllFeedingTypes(){
        return this.feedingRepository.findAllFeedingTypes();
    }

    public FeedingType getFeedingType(String typeName) {
        return this.feedingRepository.getFeedingType(typeName);
    }

    @Transactional(readOnly = true)
    public Feeding save(Feeding p){
        return this.feedingRepository.save(p);
    }

    
}
