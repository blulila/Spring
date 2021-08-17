package com.example.demo.dto;

import com.example.demo.entity.FredData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//DTO Service <-> Controller <-> DTO
public class Observation {
    //    String seriesId;
    String date;
    Double value;
//    String name;

    public static Observation fromFredData(FredData fredData){
        return new Observation(fredData.getObservationDate(), fredData.getValue());
    }
}