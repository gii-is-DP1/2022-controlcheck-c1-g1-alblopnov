package org.springframework.samples.petclinic.feeding;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feeding_type")
public class FeedingType extends BaseEntity{
    @NotNull
    @Size(min=5, max=30)
    String name;
    
    @NotNull
    String description;
}
