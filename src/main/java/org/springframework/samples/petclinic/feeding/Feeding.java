package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Feeding {
    Integer id;
    LocalDate startDate;
    double weeksDuration;
}
