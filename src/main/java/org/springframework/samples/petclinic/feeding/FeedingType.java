package org.springframework.samples.petclinic.feeding;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedingType {
    Integer id;
    String name;
    String description;
}
