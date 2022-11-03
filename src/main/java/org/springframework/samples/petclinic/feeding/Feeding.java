package org.springframework.samples.petclinic.feeding;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Feeding extends BaseEntity{

    @NotNull
    @Column(name="start_date")
    @DateTimeFormat(pattern ="yyyy/MM/dd")
    LocalDate startDate;

    @NotNull
    @Size(min=1)
    @Column(name="weeks_duration")
    double weeksDuration;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "feeding_type_id")
    FeedingType feedingType;
}
