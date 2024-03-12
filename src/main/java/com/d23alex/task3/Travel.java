package com.d23alex.task3;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Travel {
    private Location departure;
    private Location destination;
    private String description;
    private List<Person> travellers;
}
