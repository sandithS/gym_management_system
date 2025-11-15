package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Schedule {

    private String scheduleDate;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeDuration;
}
